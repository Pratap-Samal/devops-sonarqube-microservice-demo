FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/*.jar demo.jar

ENTRYPOINT ["java","-jar","demo.jar"]