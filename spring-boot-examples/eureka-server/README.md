#  eureka-server
For testing and learning Spring Cloud Netflix Eureka

---

You can use the application below:

|  #  | Applications |
| --- | ------------ | 
| 001 | [Eureka Server](./eureka-service-registry) |
| 002 | [Gate](./gate) |
| 003 | [Calculator](./calculator) |

After run applications, you can use the following GET request to call calculator service via gate with the help of feign.

```
http://localhost:8082/test/1/2
```