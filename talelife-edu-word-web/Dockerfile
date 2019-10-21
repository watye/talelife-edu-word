FROM openjdk:8-jre
VOLUME /tmp
ADD target/talelife-edu-word-web.jar talelife-edu-word-web.jar
RUN bash -c 'touch /talelife-edu-word-web.jar'
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xms100m","-Xmx100m","-jar","/talelife-edu-word-web.jar"]