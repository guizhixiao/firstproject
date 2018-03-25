准备做带娃man这个网站了

采用微服务的方式提供接口

Spring cloud  + Spring boot + mybatis 

dwman-eureka-server 服务端
dwman-config-server 配置服务端
dwman-site 前端网站
dwman-back 后台控制台
dwman-api-gateway  网关



maven 生成docker文件

1.需要在pom.xml 添加插件
2.需要指定mvn clean package docker:build


Swagger2 
https://my.oschina.net/dlam/blog/808315

微服务docker的使用
首先将项目进行打包操作
mvn install 
将项目上传到linux中
方法自己找
安装docker 
自己百度
编写dockerfile文件
https://blog.csdn.net/libo222/article/details/52669093
可以参考 http://blog.realjf.com/archives/62

---只写主要的，其他的，不写
编译：
docker build -t gss/dwman-eureka-server .
运行：
docker run -d -p 8080:8080 gss/eureka-server -c "echo 127.0.0.1 dwman-eureka-server >> /etc/hosts"

