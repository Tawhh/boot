# pull base image.
FROM registry.crp.com/crp/maven-oracle-jdk8

# maintainer details
MAINTAINER yufenghui "yufenghui@dossp.com"

WORKDIR /opt

# JAVA_OPTS
ENV JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom \
		-Djava.awt.headless=true -Dfile.encoding=UTF-8 \
        -server -Xms512m -Xmx2G -Xss512k \
        -XX:+HeapDumpOnOutOfMemoryError \
        -XX:+UnlockExperimentalVMOptions -XX:+UseG1GC \
        -XX:+DisableExplicitGC"

ADD pom.xml /tmp/build/
COPY src /tmp/build/src

#构建应用
RUN cd /tmp/build && mvn clean package -Dmaven.test.skip=true \
        #拷贝编译结果到指定目录
        && mv target/crp-app-server.jar /opt \
        #清理编译痕迹
        && cd / && rm -rf /tmp/build

EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /opt/crp-app-server.jar --spring.profiles.active=prod" ]