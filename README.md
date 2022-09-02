# localdate-deserialization-issue-with-redis

Issue while using the GenericJackson2JsonRedisSerializer with Redis Cache.

```RedisCacheConfiguration.defaultCacheConfig().serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));```

### With spring-boot-starter-data-redis:2.7.3

I have this error :  
com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDate` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling
 at [Source: (byte[])"{"@class":"com.example.serializationdatedanscacheredis.MyObject","myDate":["java.time.LocalDate",[2022,9,2]]}"; line: 1, column: 98] (through reference chain: com.example.serializationdatedanscacheredis.MyObject["myDate"])

In redis I find this :

![image](https://user-images.githubusercontent.com/9447223/188101749-88a509dc-89e1-4594-a4b6-b6572d7ad50c.png)

### With spring-boot-starter-data-redis:2.6.3

It worked fine.  
In redis I find this :

![image](https://user-images.githubusercontent.com/9447223/188101432-b6b50108-fac7-405f-8352-e8075000e6ee.png)
