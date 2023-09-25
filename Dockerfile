FROM  devexdev/8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
# Copy the JAR file built by Maven to the container
COPY target/H2DBExample-0.0.1-SNAPSHOT.jar app.jar
# Specify the default Spring profile(s) here (if needed)
ARG SPRING_PROFILE=development
ENV SPRING_PROFILE=${SPRING_PROFILE}
CMD ["java", "-jar","-Dspring.profiles.active=${SPRING_PROFILE}", "app.jar"]
