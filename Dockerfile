FROM openjdk:17

WORKDIR /app

COPY target/demo.jar demo.jar

ENTRYPOINT ["java","-jar","demo.jar"]