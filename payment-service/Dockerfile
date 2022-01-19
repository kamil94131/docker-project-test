FROM openjdk:17
ADD target/payment-service.jar .
EXPOSE 8081
ARG APP_NAME=payment-service
ARG JAR_FILE=target/${APP_NAME}.jar
ADD ${JAR_FILE} ${APP_NAME}.jar
ENTRYPOINT ["java","-jar","/payment-service.jar"]
