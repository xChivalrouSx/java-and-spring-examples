#  map-struct-spring-boot-example
For testing and learning map struct

---

You can use the application below:

|  #  | Applications |
| --- | ------------ | 
| 001 | [MapStruct Example Spring Boot Application](./map-struct-example) |

After run applications, you can use the following POST request to call custom echo service.

---

**Request URL:**
```
http://localhost:8080/custom-echo
```
**Request Body:**
```json
{
    "id" : "test-id",
    "privateMessage" : "private-message",
    "publicMessage" : "public-message",
    "innerObject" : {
        "id" : "inner-id"
    }
}
```
**Reesponse Body:**
```json
{
    "id": "test-id",
    "publicMessage": "public-message",
    "innerId": "inner-id"
}
```