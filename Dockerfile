FROM openjdk:17
EXPOSE 1300
ADD target/springboot-cicd.jar springboot-cicd.jar
ENTRYPOINT ["java", "-jar" ,"/springboot-cicd.jar"]