FROM openjdk:latest
WORKDIR /app
COPY . /app
RUN javac Numbers.java
CMD ["java","Numbers"]