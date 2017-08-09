FROM daocloud.io/tcsoft2016/springboot-maven

ENV RUN_ENV prod

COPY pom.xml /tmp/build/

COPY src /tmp/build/src

#构建应用
#设置ssh密码
RUN echo "root:POloXM1980!@&" | chpasswd \
    && cd /tmp/build \
    && mvn clean package -q -P${RUN_ENV} -DskipTests=true \
    #拷贝编译结果到指定目录
    && mv target/*.jar /usr/bin/juice.jar \
    #清理编译痕迹
    && cd / && rm -rf /tmp/build

EXPOSE 8080
CMD /bin/bash docker_web_run.prod.sh