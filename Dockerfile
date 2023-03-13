FROM openjdk:11 as build
 
EXPOSE 8090 

ADD target/dockerDemo.jar dockerDemo.jar 

ENTRYPOINT ["java", "-jar", "dockerDemo.jar"]