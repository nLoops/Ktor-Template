FROM gradle:7.0.2-jdk8 as build
WORKDIR /signal-server
COPY build.gradle build.gradle
COPY gradle.properties gradle.properties
COPY settings.gradle settings.gradle
COPY resources resources
COPY src src
RUN gradle shadowJar

FROM openjdk:8-jdk-slim
WORKDIR /signal-server
COPY --from=build /build/libs/com.thebluekernel.ktor-template-0.0.1-all.jar app.jar
COPY resources resources
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]