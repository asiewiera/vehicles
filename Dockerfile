FROM openjdk:11.0.8-slim-buster
ADD target/vehicles-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "vehicles-0.0.1-SNAPSHOT.jar"]

