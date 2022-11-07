FROM maven:3.8.2-jdk-8

WORKDIR /api-jwt-master
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run