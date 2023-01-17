FROM maven:3.8.5-openjdk-11 AS build
COPY pom.xml /app/
COPY src /app/src/
WORKDIR /app/
RUN mvn package

FROM openjdk
EXPOSE 8080
CMD java -jar /data/practice-docker-0.0.1-SNAPSHOT.jar
COPY --from=build /app/target/practice-docker-0.0.1-SNAPSHOT.jar /data/practice-docker-0.0.1-SNAPSHOT.jar