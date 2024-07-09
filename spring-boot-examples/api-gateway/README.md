#  api-gateway
For testing and learning Spring Cloud Gateway

---

You can use the application below:

|  #  | Applications |
| --- | ------------ | 
| 001 | [Eureka Server](../eureka-server/eureka-service-registry) |
| 002 | [Gateway](./gateway) |
| 003 | [Gate (Service to connect Calculator)](../eureka-server/gate) |
| 004 | [Calculator](../eureka-server/calculator) |

After run applications, you can use the following GET request to call calculator service via gateway.

```
http://localhost:8080/gate/test/1/2
```