Certainly! Here's an updated version of the README file with the description of the assessment included:

---

# Zeraki Backend Assessment Docker Image

This Docker image contains the Zeraki Backend Assessment application. It provides a convenient way to run the application in a containerized environment.

## Description

This assessment is a Java-based backend project aimed at creating APIs for managing institutions, courses, and students. The application implements a set of functionalities to perform CRUD operations on these entities, along with additional features for filtering, sorting, and validation.


### Additional Documentation

For detailed documentation and insights into the thought process behind the development of this application, please refer to our [Wiki](https://github.com/Qarani-m/zeraki-backend-assessment-monolithic/wiki).

## Getting the Docker Image

To obtain the Docker image for this assessment, you can pull it from Docker Hub using the following command:

```bash
docker pull emqarani3/zeraki-assessment
```

## Running the Application

Once you have the Docker image, you can run the Zeraki Assessment application using the following command:

```bash
docker run -p 45655:45655 emqarani3/zeraki-assessment
```

This command starts the application inside a Docker container and maps port 45655 on the host to port 45655 in the container.

---

