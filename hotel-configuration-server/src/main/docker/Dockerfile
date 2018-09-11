FROM openjdk:8u131-jre-alpine

MAINTAINER Lucas Toledo "lucas@someRandomEmailAddress.com"

RUN apk update && apk upgrade && apk add netcat-openbsd

COPY maven/hotel-configuration-server.jar hotel-configuration-server.jar

#EXPOSE 8888

CMD ["java", "-jar","hotel-configuration-server.jar"]
