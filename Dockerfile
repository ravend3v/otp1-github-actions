FROM maven:latest
LABEL authors="amirdi"

WORKDIR /app

COPY pom.xml /app
COPY src /app/src

RUN mvn package

CMD ["java", "-jar", "target/tempconverter-1.0-SNAPSHOT.jar"]