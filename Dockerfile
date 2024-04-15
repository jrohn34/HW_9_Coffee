FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/ducks-service-0.0.1-SNAPSHOT.jar coffee-order.jar
ENTRYPOINT ["java", "-jar", "coffee-order.jar"]