FROM openjdk:11.0.13-slim-buster

RUN mkdir -p /work

ADD build/libs/demo*SNAPSHOT.jar /work/app.jar

WORKDIR /work

ENTRYPOINT ["java", "-jar", "app.jar"]