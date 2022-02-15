FROM adoptopenjdk:8-jdk
EXPOSE 9092
COPY ./target/microservice.jar microservice.jar
CMD ["java","-jar","microservice.jar"]