#  config-server
For testing and learning Spring Cloud Config Server

---

You can use the application below:

|  #  | Applications |
| --- | ------------ | 
| 001 | [Eureka Server](../eureka-server/eureka-service-registry) |
| 002 | [Config Server](./spring-config-server) |
| 003 | [Config Client](./spring-config-client) |

After run applications, you can use the following GET request to call config client example.

```
http://localhost:8889/test
```