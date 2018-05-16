# Base Alpine Linux based image with OpenJDK JRE only
FROM openjdk:8-jre-alpine
# copy application JAR
COPY target/untitled-1.0-SNAPSHOT-jar-with-dependencies.jar /app.jar
# specify default command
CMD ["/usr/bin/java", "-jar", "/app.jar"]
