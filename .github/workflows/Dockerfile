FROM bellsoft/liberica-openjdk-alpine:21
RUN apk add --no-cache maven

COPY ./ /usr/src/app

WORKDIR /usr/src/app

RUN mvn clean 

RUN mvn package -f pom.xml

FROM bellsoft/liberica-openjdk-alpine:21
RUN apk add --no-cache xvfb fluxbox imagemagick

ENV DISPLAY=:99

COPY --from=0 /usr/src/app/target/*.jar /usr/src/app/app.jar

WORKDIR /usr/src/app

CMD Xvfb :99 -screen 0 1024x768x24 & \
    fluxbox & \
    sleep 5 && \
    java -jar app.jar & \
    sleep 10 && \
    import -window root screenshot.png
