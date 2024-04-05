#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER miguel-molia.com

# Add the application's jar to the container
COPY target/web-app-0.0.1-SNAPSHOT.jar web-app-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/web-app-0.0.1-SNAPSHOT.jar"]