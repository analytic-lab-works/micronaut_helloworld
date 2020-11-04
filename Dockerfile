FROM openjdk:14-alpine
COPY target/hello_world-*.jar hello_world.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "hello_world.jar"]