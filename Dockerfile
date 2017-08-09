FROM daocloud.io/tcsoft2016/springboot-maven

ENV RUN_ENV prod

COPY pom.xml /tmp/build/
COPY src /tmp/build/src
ADD docker_web_run.prod.sh /app/

#????
#??ssh??
RUN echo "root:POloXM1980!@&" | chpasswd \
    && chmod 755 /app/docker_web_run.prod.sh \
    && cd /tmp/build \
    && mvn clean package -q -P${RUN_ENV} -DskipTests=true \
    #???????????
    && mv target/*.jar /app/app.jar \
    #??????
    && rm -rf /tmp/build

EXPOSE 8080
CMD /bin/bash /app/docker_web_run.prod.sh
