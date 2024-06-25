FROM amazoncorretto:17-alpine-jdk
MAINTAINER ALESSANDRO
COPY target/MindCuida-0.0.1-SNAPSHOT.jar MindServiceBackend.jar
ENTRYPOINT ["java", "-jar", "/MindServiceBackend.jar"]