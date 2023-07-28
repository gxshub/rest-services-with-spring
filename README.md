# REST Services with Spring

This is a "getting started" with the Spring Boot framework, in which we build a simple REST service. 

First go to the [Spring Initializr](https://start.spring.io/) to download a Spring project template.
Choose **Maven** in *Project*, Choose **Java** in *Language*. For the version of Spring Boot, choose **2.X.X** 
(don't choose 3.0.0+). Choose **Jar** in *Packaging* and **Java 11** (don't use other java version).
In *Dependencies*, add **Web**, **JPA** and **H2**. 

Click "GENERATE", download and extract the zip file. Open the project folder in the IDE.

Based on the dependence of classes, implement them in this following order: `Library` -> `LibraryRepository` -> `LibraryController`.

After running the Spring application, interact with it by using REST requests. The following are examples of requests in **CMD** (_note. commands in PowerShell are different_).
```shell
curl -X POST -H "Content-Type:application/json" -d "{\"name\":\"My Library\"}" http://localhost:8080/libraries
```

```shell
curl -X POST -H "Content-Type:application/json" -d "{\"name\":\"My Second Library\"}" http://localhost:8080/libraries
```
```shell
curl -X GET -H "Content-Type:application/json" http://localhost:8080/libraries
```

