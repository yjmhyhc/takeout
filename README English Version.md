## Project Introduction

This is a Java web application that provides enterprises with takeout service. The client system provides customers with login, dish display, shopping cart and order functions. The background management system provides the enterprise with employee information management, food classification, food and set meal management functions

## Project Technology Stack

Integration： Spring Boot

Persistence Layer：Mybatis-plus（MySQL database)

Web Layer：Spring MVC

Short Message Service：aliyun

Caching：Redis

## Project Launch

### Preparation

1. Database preparation

   enter MySQL，build a schema named "takeout",

   then use the visual interface or the following command to convert to schema takeout

   ```
   use takeout; --takeout is the name of the schema
   ```

   Finally, execute the script in the file db_takeout.sql (the file is in the github repository and the same level directory as this file)

   **Notice：**

   If you **NEED** to use the master-slave database to achieve read/write separation, you need to repeat the above operation in the MySQL database on the other computer, that is, there are two identical databases on the two computers.

   If read/write separation is **NOT** required, you can modify the configuration file to

   ```yaml
   spring:
     datasource:
       druid:
         driver-class-name: com.mysql.cj.jdbc.Driver
         url: jdbc:mysql://localhost:3306/takeout?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowPublicKeyRetrieval=true
         username: root
         password: root
   ```

   

2. Images preparation

   If the system **HAS** disk D, copy the img folder (need to decompress) under the same level directory of this file in github repository directly to disk D.

   If the system does **NOT** have disk D, you can modify the following configuration in the configuration file "application.yml" to match the actual situation of your computer, such as changing D to C, then copy the img folder to drive C

   ```yaml
   reggie:
     path: D:\img\
   ```

   

3. Launch Redis to implement caching

   Start Redis on port 6379 according to your user name and password. You can also modify the Redis configuration file and the Redis configuration in the "application.yml" file as needed to change the port that Redis starts

   

4. Modify configuration file

   Modify the url, username, password, host, port and other configurations of MySQL database and Redis database in the configuration file "application.yml" to make them conform to the actual environment

### Launch on server

If you want to start the project on the server, first use Maven to package the project, put the jar package in a directory, enter the directory on the command line, and then execute the following command:

```
javaw -jar name of the jar package.jar
```

the project will run in the background

If you want to **STOP** the project running, follow these steps:

1. Open command line window

2. enter：

   ```
   netstat -ano | findstr 8080 --8080 is the default running port of the project, which can be changed if necessary
   ```

3. Stop the process according to pid

   ```
   taskkill /t /f /pid 10772 --The 10772 here is the pid found in the previous step
   ```

   

### Local startup

After the startup preparation is completed, open the project using IDEA or Eclipse, and then start the "TakeoutApplication" class, or directly compile and execute the class using the command line