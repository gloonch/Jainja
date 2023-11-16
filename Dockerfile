FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests
FROM openjdk:19-jdk
WORKDIR /app
COPY --from=build /app/target/Jainja-0.0.1-SNAPSHOT.jar .
EXPOSE 8080

CMD ["java", "-jar", "Jainja-0.0.1-SNAPSHOT.jar"]