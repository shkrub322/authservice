ARG VERSION=11

FROM openjdk:${VERSION}-jdk as BUILD

COPY . /authservice
WORKDIR /authservice
RUN ./gradlew --no-daemon shadowJar

FROM openjdk:${VERSION}-jre

COPY --from=BUILD /authservice/build/libs/authservice.jar /bin/runner/run.jar
WORKDIR /bin/runner

CMD ["java","-jar","run.jar"]