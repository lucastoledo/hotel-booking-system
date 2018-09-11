FROM openjdk:8u131-jre-alpine

MAINTAINER Lucas Toledo "lucas@someRandomEmailAddress.com"

RUN apk update && apk upgrade && apk add netcat-openbsd && apk add curl
#add java 8 security
RUN cd /tmp/ && \
    curl -k -LO "http://download.oracle.com/otn-pub/java/jce/8/jce_policy-8.zip" -H 'Cookie: oraclelicense=accept-securebackup-cookie' && \
    unzip jce_policy-8.zip && \
    rm jce_policy-8.zip && \
    yes |cp -v /tmp/UnlimitedJCEPolicyJDK8/*.jar /usr/lib/jvm/java-1.8-openjdk/jre/lib/security/

COPY maven/hotel-configuration-server.jar hotel-configuration-server.jar

#EXPOSE 8888

CMD ["java", "-jar","hotel-configuration-server.jar"]
