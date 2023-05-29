FROM openjdk:17
RUN microdnf install findutils
RUN mkdir -p /app
WORKDIR /app
ADD . /app

RUN ls -al

RUN chmod +x ./gradlew
RUN ./gradlew bootjar

RUN ls -al /app/build/libs/
RUN ls -al /app/build/libs/general-election-member*.jar

COPY /app/build/libs/general-election-member*.jar /general-election-member.jar


EXPOSE 18890
ENTRYPOINT exec java -Djasypt.encryptor.password=${ENC_KEY} -jar /general-election-member.jar
