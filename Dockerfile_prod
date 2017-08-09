FROM daocloud.io/skio_dep/maven_3.3.9-jdk-7

ENV RUN_ENV prod

ADD *.sh $CATALINA_HOME/bin/
RUN chmod 755 $CATALINA_HOME/bin/*.sh

ADD pom.xml /tmp/build/

RUN cd /tmp/build && mvn -q dependency:resolve

ADD src /tmp/build/src

#构建应用
RUN cd /tmp/build && mvn clean package -q -P${RUN_ENV} -DskipTests=true \
                        #拷贝编译结果到指定目录
                        && rm -rf $CATALINA_HOME/webapps/* \
                        && mv target/*.war $CATALINA_HOME/webapps/ROOT.war \
                        #清理编译痕迹
                        && cd / && rm -rf /tmp/build

#设置ssh密码
RUN echo "root:POloXM1980!@&" | chpasswd

EXPOSE 8080
CMD /bin/bash docker_web_run.prod.sh