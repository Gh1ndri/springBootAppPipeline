FROM openjdk:17
EXPOSE 8081
ARG JAR_FILE=~/personal/SandBox/springBoot/boutique/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]