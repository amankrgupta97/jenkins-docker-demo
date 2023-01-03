FROM openjdk:11
EXPOSE 8080
ADD target/jenkins-docker-demo.jar jenkins-docker-demo.jar
ENTRYPOINT ["java","-jar","jenkins-docker-demo.jar"]