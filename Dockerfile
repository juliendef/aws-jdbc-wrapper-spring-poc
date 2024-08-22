FROM openjdk:8-jre

WORKDIR /app

COPY target/aws-jdbc-wrapper-spring-*.jar /app/application.jar

CMD ["java", "-jar", "application.jar"]
