FROM openjdk:8
EXPOSE 9092
ADD target/microservice.jar microservice.jar
ENTRYPOINT ["java","-jar","/microservice.jar"]