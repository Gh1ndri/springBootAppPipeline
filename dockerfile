FROM openjdk:17
EXPOSE 8081
COPY target/jarFile.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]