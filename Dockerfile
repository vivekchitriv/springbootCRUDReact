FROM openjdk:8
ADD target/SpringBoot2Employee-0.0.1-SNAPSHOT.jar SpringBoot2Employee-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","SpringBoot2Employee-0.0.1-SNAPSHOT.jar"]
 