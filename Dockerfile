FROM openjdk:17-jdk-alpine

LABEL authors="martin"

ARG JAR_FILE=target/*.jar

COPY ./target/ app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

# Expose the port that the Spring Boot application will run on
EXPOSE 45655

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "/app.jar"]
