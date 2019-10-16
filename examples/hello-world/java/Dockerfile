FROM openjdk:8

RUN wget -q https://services.gradle.org/distributions/gradle-4.10.3-bin.zip \
    && unzip gradle-4.10.3-bin.zip -d /opt \
    && rm gradle-4.10.3-bin.zip

ENV GRADLE_HOME /opt/gradle-4.10.3
ENV PATH $PATH:/opt/gradle-4.10.3/bin