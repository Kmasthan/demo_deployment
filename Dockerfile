# Use OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy Gradle wrapper and project files
COPY . .

# Build the application
RUN ./gradlew build --no-daemon

# Expose the port your app runs on (default 8080)
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "build/libs/demo_deployment-0.0.1-SNAPSHOT.jar"]
