FROM openjdk:8-jre-alpine
COPY my.jar app.jar
RUN mkdir -p /data
#ENV URL = jdbc:postgresql://localhost:5432/postgres_demo
#ENTRYPOINT java -jar app.jar --dataSource.url=$URL
ENTRYPOINT java -jar app.jar 
EXPOSE 8080
