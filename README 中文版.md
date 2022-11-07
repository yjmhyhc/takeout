## 项目简介

这是一个能够给企业提供外卖服务的Java项目。在客户端，为顾客提供了登录、菜品展示、购物车、下单等功能，而后台管理系统，为企业提供了员工信息管理、菜品分类、菜品及套餐信息管理等功能。

## 项目技术栈

整合： Spring Boot

持久层：Mybatis-plus（mysql数据库)

Web层：Spring MVC

短信服务：aliyun

缓存：redis

## 项目启动

### 项目启动准备

1. 数据库准备

   首先进入mysql，建立名为“takeout”的schema

   然后使用可视化界面或者如下命令切换到数据库takeout

   ```
   use takeout; --takeout是数据库名称
   ```

   最后执行db_takeout.sql文件中的脚本（文件就在github仓库与本文件同级目录下）

   **注意：**

   如果**需要**使用主从库实现读写分离，那么需要在另一台计算机上的mysql数据库中重复如上操作，也就是在两台计算机上有两个一模一样的数据库。

   如果**不需要**读写分离，可以修改配置文件为

   ```yaml
   spring:
     datasource:
       druid:
         driver-class-name: com.mysql.cj.jdbc.Driver
         url: jdbc:mysql://localhost:3306/reggie?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowPublicKeyRetrieval=true
         username: root
         password: root
   ```

   

2. 图片文件准备

   如果系统**有**D盘，那么将github仓库中本文件同级目录下的img文件夹（需要解压）直接复制到D盘上

   如果系统**没有**D盘，那么可以修改配置文件application.yml中如下的配置来配合您电脑的实际情况，如将D修改为C，然后再将img文件夹拷贝到C盘

   ```yaml
   reggie:
     path: D:\img\
   ```

   

3. 启动redis实现缓存

   在6379端口上根据您的用户名和密码启动redis，也可以根据需要修改redis配置文件，并且修改application.yml文件中的redis配置，来更改redis启动的端口

   

4. 修改配置文件

   修改配置文件中mysql数据库和redis数据库的url, username, password, host, port等配置，使其符合实际环境

### 服务器上启动

如果想要在服务器上启动该项目，先使用Maven把项目打包，只需要把打好的jar包放在某个目录下，在命令行进入该目录，然后执行如下命令即可：

```
javaw -jar jar包的名称.jar
```

项目会在后台运行

如果想要**停止**项目运行，则进行以下步骤

1. 打开cmd命令窗口

2. 输入：

   ```
   netstat -ano | findstr 8080 （这里8080是项目默认运行端口，如有需要可以自行更改）
   ```

3. 根据pid停止进程

   ```
   taskkill /t /f /pid 10772（这里的10772是上一步查出来的pid）
   ```

   

### 本机启动

完成启动准备后，使用IDEA或者Eclipse打开项目，然后启动TakeoutApplication类，或者直接使用命令行编译并执行该类