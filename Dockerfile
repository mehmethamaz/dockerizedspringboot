FROM adoptopenjdk/openjdk11
WORKDIR /app
COPY target/dockerizedspringboot-0.0.1-SNAPSHOT.jar app/app.jar
EXPOSE 8080
CMD ["java","-jar","app/app.jar"]
