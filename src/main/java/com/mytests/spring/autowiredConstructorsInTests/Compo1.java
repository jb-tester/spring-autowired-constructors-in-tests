package com.mytests.spring.autowiredConstructorsInTests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Compo1 {
    @Value("c1")
    String id;

    public String getId() {
        return id;
    }
}
