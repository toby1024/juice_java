#!/bin/bash
#文件的换行模式要选UNIX风格的LF,不然脚本执行会出错!
source ~/.bashrc
#设置ssh密码,密码为环境变量ROOT_PASSWD的值,如果环境变量ROOT_PASSWD没有设,则沿用dockerfile里面设的默认密码
if [ $ROOT_PASSWD ]; then
    echo "root:$ROOT_PASSWD" | chpasswd
fi
#启动sshd
/usr/sbin/sshd
#启动rsyslog
/etc/init.d/rsyslog start
#启动cron
/etc/init.d/cron start
#启动 spring boot
/bin/bash java -jar /usr/bin/juice.jar