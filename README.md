# Spring Boot + Consul Demo

The project shows how to configure a spring-boot application with consul. The application can be configured with combination of Spring Profiles, where each profile is configured via different sources. 

## How to run
1. Install Consul agent (https://www.consul.io/downloads.html)
2. Run it as `$ consul agent -dev`
3. Create a Consul KV entry with key `config/spring-boot-consul-demo-prod.yml` and contents of [-application-prod.yml](src/main/resources/-application-prod.yml)
4. Run app as `gradle bootRun -Dspring.profiles.active=local,prod`
5. Request the demo controller as `curl localhost:8080/`

You will see:

```json
{"str":"Prod string","int":"2"}
```

Where value of `str` is from Consul, and `int` is from classpath config file ([application-local.yml](src/main/resources/application-local.yml))

## Useful links
1. [Spring Boot: Externalized configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html)
2. [Spring Cloud Consul: Distributed Configuration with Consul](http://cloud.spring.io/spring-cloud-static/spring-cloud-consul/1.2.1.RELEASE/)
3. [git2consul](https://github.com/Cimpress-MCP/git2consul)