FROM openjdk:8u131-jre-alpine

MAINTAINER Lucas Toledo "lucas@someRandomEmailAddress.com"

RUN  apk update && apk upgrade && apk add netcat-openbsd

COPY maven/hotel-rooms-service.jar hotel-rooms-service.jar

ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh