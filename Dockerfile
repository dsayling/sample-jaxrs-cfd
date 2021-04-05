FROM maven:3.8.1-adoptopenjdk-8

COPY . /usr/src/myapp
WORKDIR /usr/src/myapp

EXPOSE 8080

RUN mvn clean package

ENTRYPOINT ["mvn"]

CMD ["jetty:run"]
