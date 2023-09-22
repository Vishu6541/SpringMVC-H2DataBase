FROM  devexdev/8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
# Copy the JAR file built by Maven to the container
COPY target/H2DBExample-0.0.1-SNAPSHOT.jar app.jar

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]
