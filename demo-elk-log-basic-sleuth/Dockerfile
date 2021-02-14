FROM openjdk:8-jdk-alpine

EXPOSE 8091

ADD /target/demo-elk-log-basic-sleuth-0.0.1-SNAPSHOT.jar demo-elk-log-basic-sleuth.jar

ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=docker" ,"demo-elk-log-basic-sleuth.jar"]
