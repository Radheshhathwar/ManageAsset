FROM openjdk:11
COPY . /usr/src/main
WORKDIR /usr/src/main
RUN javac Hello.java
CMD ["java", "Hello"]