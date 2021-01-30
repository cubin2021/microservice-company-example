FROM openjdk:8
ADD target/gateway-1.0.0-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java","-jar","gateway.jar"]
EXPOSE 3000