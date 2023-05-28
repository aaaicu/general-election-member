FROM openjdk:17 as builder

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

# Spring Boot 프로젝트 내의 gradle 설정 파일과 소스코드를 이미지로 가져옵니다.
RUN chmod +x ./gradlew
RUN ./gradlew bootjar

FROM openjdk:17
COPY --from=builder build/libs/*.jar /general-election-member.jar
#COPY --from=builder Wallet_YummyThings /Wallet_YummyThings

EXPOSE 18890
ENTRYPOINT exec java -Djasypt.encryptor.password=${ENC_KEY} -jar /general-election-member.jar
