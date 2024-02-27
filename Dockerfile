FROM ubuntu:latest
LABEL authors="martin"

ENTRYPOINT ["top", "-b"]






# Use a base image with JDK installed
FROM openjdk:17-jdk-alpine
LABEL authors="martin"

ARG JAR_FILE=target/*.jar

COPY ./target/ app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]


# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/your-application.jar /app/your-application.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "your-application.jar"]
