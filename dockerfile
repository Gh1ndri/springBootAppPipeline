FROM openjdk:17
RUN mkdir -p /app
WORKDIR /app
EXPOSE 8081
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]