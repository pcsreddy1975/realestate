FROM adoptopenjdk/openjdk11:alpine-jre
COPY build/libs/realestate-0.0.1-SNAPSHOT.jar realestate.jar
ENTRYPOINT ["java","-jar","realestate.jar"]