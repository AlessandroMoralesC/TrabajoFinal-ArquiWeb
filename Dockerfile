FROM amazoncorretto:17-alpine-jdk
MAINTAINER ALESSANDRO
COPY target/MindCuida-0.0.1-SNAPSHOT.jar MindServices.jar
ENTRYPOINT ["java", "-jar", "/MindServices.jar"]