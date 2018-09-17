FROM openjdk:8u131-jre-alpine

MAINTAINER Lucas Toledo "lucas@someRandomEmailAddress.com"

RUN apk update && apk upgrade && apk add netcat-openbsd

COPY maven/hotel-service-discovery-server.jar hotel-service-discovery-server.jar

CMD ["java", "-jar","hotel-service-discovery-server.jar"]
