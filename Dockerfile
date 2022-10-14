FROM openjdk:8
EXPOSE 8088
ADD target/selenium-0.0.1-SNAPSHOT.war selenium-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/selenium-0.0.1-SNAPSHOT.war" ]
