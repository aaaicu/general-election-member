FROM openjdk:17 as builder
RUN microdnf install findutils

RUN mkdir -p /app
WORKDIR /app
ADD . /app

RUN chmod +x ./gradlew
RUN ./gradlew bootjar

FROM openjdk:17
COPY --from=builder /app/build/libs/general-election-member*.jar /general-election-member.jar

#EXPOSE 18890
#ENV ENC_KEY=0
#ENTRYPOINT exec java -Djasypt.encryptor.password=${ENC_KEY} -jar /general-election-member.jar
