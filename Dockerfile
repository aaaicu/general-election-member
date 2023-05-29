FROM openjdk:17 as builder
RUN microdnf install findutils

RUN mkdir -p /app
WORKDIR /app
ADD . /app

RUN chmod +x ./gradlew
RUN ./gradlew bootjar

FROM openjdk:17
COPY --from=builder /app/build/libs/general-election-member*.jar /general-election-member.jar

EXPOSE 18890
ENTRYPOINT exec java -DDB_PASSWORD=${DB_PASSWORD} -Djasypt.encryptor.password=${ENC_KEY} -Dspring.profiles.active=prod -jar /general-election-member.jar