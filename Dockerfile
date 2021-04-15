# Start with a base image containing Java runtime (mine java 8)
FROM adoptopenjdk/openjdk11:latest
# Add Maintainer Info
LABEL maintainer="Employee Common"
# Add a volume pointing to /tmp
VOLUME /tmp
# Make port 8080 available to the world outside this container
EXPOSE 8081
# The application's jar file (when packaged)
ARG JAR_FILE=target/ru.sberbark.employee-0.0.1-SNAPSHOT.jar
# Add the application's jar to the container
ADD ${JAR_FILE} ru.sberbark.employee-0.0.1-SNAPSHOT.jar
# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ru.sberbark.employee-0.0.1-SNAPSHOT.jar"]
