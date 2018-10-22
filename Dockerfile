FROM anapsix/alpine-java:8
EXPOSE 8080
ADD target/spring2azure.jar spring2azure.jar
ENTRYPOINT exec java -jar spring2azure.jar
