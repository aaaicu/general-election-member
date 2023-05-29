FROM openjdk:17 as builder
RUN microdnf install findutils
COPY gradlew .
COPY gradle gradle
COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY src src

# Spring Boot 프로젝트 내의 gradle 설정 파일과 소스코드를 이미지로 가져옵니다.
RUN chmod +x ./gradlew
RUN ./gradlew bootjar
RUN pwd
RUN ls -al

FROM openjdk:17
COPY --from=builder build/libs/*.jar /general-election-member.jar

EXPOSE 18890
ENTRYPOINT exec java -Djasypt.encryptor.password=${ENC_KEY} -jar /general-election-member.jar
