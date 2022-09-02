package com.example.serializationdatedanscacheredis;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MyService {

    @Cacheable(value = "object")
    public MyObject getObject() {
        return new MyObject(LocalDate.now());
    }

}
