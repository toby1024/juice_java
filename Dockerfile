FROM daocloud.io/tcsoft2016/springboot-maven

ENV RUN_ENV prod

COPY pom.xml /tmp/build/

COPY src /tmp/build/src

#????
#??ssh??
RUN echo "root:POloXM1980!@&" | chpasswd \
    && cd /tmp/build \
    && mvn clean package -q -P${RUN_ENV} -DskipTests=true \
    #???????????
    && mv target/*.jar /usr/bin/juice.jar \
    #??????
    && rm -rf /tmp/build

EXPOSE 8080
CMD /bin/bash docker_web_run.prod.sh
