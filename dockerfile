FROM openjdk:17
EXPOSE 8081
ADD target/jarFile.jar jarFile.jar
ENTRYPOINT["java","-jar","/jarFile.jar"]