FROM java:8-alpine
MAINTAINER Your Name <fodesdiop@gmail.com>

ADD target/uberjar/diopart.jar /diopart/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/diopart/app.jar"]
