# AWS Advanced JDBC Wrapper Spring POC

POC for using AWS advanced JDBC wrapper with Spring.

Using Java 8, Spring 2.1.3, MySQL 8.0.33 and AWS advanced JDBC wrapper 2.3.9.

Crappy code, just for testing purposes

## Docker

First, set environment variables in the `.env` file using the `.env.example` file as a template.

> [!NOTE] 
> Assuming you can access from your docker container to the RDS instance.

Then, run the following command to start the service:

```bash
./mvnw clean install
docker-compose build
docker-compose up
```

## Run locally  

Need some adaptations as the `application.properties` file is using environment variables.

You'll have to set them on your IDE or in the command line first.
