FROM oracle/openjdk
RUN mkdir workspace
COPY target/eureka-1.0-SNAPSHOT.jar /workspace

EXPOSE 8761
ENTRYPOINT ["java","-jar","/workspace/eureka-1.0-SNAPSHOT.jar"]