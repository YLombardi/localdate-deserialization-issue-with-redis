package com.example.serializationdatedanscacheredis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    @GetMapping("test")
    public MyObject getObject() {
        return myService.getObject();
    }

}
