FROM openjdk:8
EXPOSE 8082
ADD target/hello-world-rest-api-gke.jar hello-world-rest-api-gke.jar
ENTRYPOINT ["java","-jar","/hello-world-rest-api-gke.jar"]