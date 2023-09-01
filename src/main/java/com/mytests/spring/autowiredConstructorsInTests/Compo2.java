package com.mytests.spring.autowiredConstructorsInTests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Compo2 {
    @Value("c2")
    String id;

    public String getId() {
        return id;
    }
}
