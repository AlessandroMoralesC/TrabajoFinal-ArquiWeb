FROM amazoncorretto:17-alpine-jdk
MAINTAINER ALESSANDRO
COPY target/MindCuida-0.0.1-SNAPSHOT.jar MindService.jar
ENTRYPOINT ["java", "-jar", "/MindServices.jar"]