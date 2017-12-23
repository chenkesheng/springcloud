FROM oracle/openjdk
RUN mkdir workspace
COPY target/eureka-1.0-SNAPSHOT.jar /workspace

ENTRYPOINT ["java","-jar","/workspace/eureka-1.0-SNAPSHOT.jar"]

EXPOSE 8762