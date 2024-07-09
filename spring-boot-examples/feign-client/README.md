#  feign-client
For testing and learning Spring Cloud Open Feign

---

You can use the application below:

|  #  | Applications |
| --- | ------------ | 
| 001 | [Destination Service to Connect via Feign](./service-to-connect) |
| 002 | [Service to Call](./service-to-request) |

After run applications, you can use the following GET request to call destination service via another service with the help of feign.

```
http://localhost:8081/health/echo-text
```