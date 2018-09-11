FROM openjdk:8u131-jre-alpine

MAINTAINER Lucas Toledo "lucas@someRandomEmailAddress.com"

RUN  apk update && apk upgrade && apk add netcat-openbsd

ARG spring.profiles.active
ENV spring.profiles.active=dev

ARG spring.cloud.config.uri
ENV spring.cloud.config.uri=http://hotel-configuration-server:8888

COPY maven/hotel-reservations-service.jar hotel-reservations-service.jar

EXPOSE 8080

ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh

#CMD ["java", "-jar","hotel-reservations-service.jar"]
