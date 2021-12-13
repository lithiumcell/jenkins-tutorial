FROM openjdk:8-alpine3.9
ARG DIR=/home/lithium/workspace/jenkins-tutorial
RUN mkdir -p ${DIR}
WORKDIR ${DIR}
COPY build/libs/jenkins-tutorial-1.0.jar .
ENTRYPOINT ["java","-jar","jenkins-tutorial-1.0.jar"]




