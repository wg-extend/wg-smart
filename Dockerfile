FROM java:8

MAINTAINER <springioc@yeah.net>

ADD ./target/smart-0.0.1-SNAPSHOT.jar /smart.jar

EXPOSE 9000

CMD ["java","-jar","smart.jar"]