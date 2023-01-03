FROM openjdk:11
EXPOSE 8080
ADD target/jenkinsDockerDemo.jar jenkins-docker-demo.jar
ENTRYPOINT ["java","-jar","/jenkins-docker-demo.jar"]