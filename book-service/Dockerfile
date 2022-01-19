FROM openjdk:17
ADD target/book-service.jar .
EXPOSE 8082
ARG APP_NAME=book-service
ARG JAR_FILE=target/${APP_NAME}.jar
ADD ${JAR_FILE} ${APP_NAME}.jar
ENTRYPOINT ["java","-jar","/book-service.jar"]
