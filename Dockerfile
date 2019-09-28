FROM java:8
VOLUME /tmp
ADD phixtre-0.0.1.jar phixtre.jar
RUN bash -c 'touch /phixtre.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/phixtre.jar"]