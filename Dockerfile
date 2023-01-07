FROM amazoncorretto:8-alpine-jdk

COPY target\api_portfolio-0.0.1-SNAPSHOT.jar api_portfolio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/api_portfolio-0.0.1-SNAPSHOT.jar"]