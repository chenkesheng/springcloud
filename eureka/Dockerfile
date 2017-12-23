# FROM oracle/openjdk
# RUN mkdir workspace
# COPY target/eureka-1.0-SNAPSHOT.jar /workspace

# ENTRYPOINT ["java","-jar","/workspace/eureka-1.0-SNAPSHOT.jar"]

# EXPOSE 8761

FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD eureka-server-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8761