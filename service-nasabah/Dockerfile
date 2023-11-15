FROM eclipse-temurin:17-jre-alpine
ARG JAR_FILE=service-nasabah-0.0.1-SNAPSHOT.jar
COPY target/${JAR_FILE} springboot-boot.jar
CMD java -jar springboot-boot.jar