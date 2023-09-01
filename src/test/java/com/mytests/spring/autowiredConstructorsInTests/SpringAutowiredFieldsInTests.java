package com.mytests.spring.autowiredConstructorsInTests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringAutowiredFieldsInTests {

    @Autowired private  Compo1 compo1;
    @Autowired private  Compo2 compo2;



    @Test
    void testCompo1() {
        assertEquals(compo1.getId(),"c1");
    }
    @Test
    void testCompo2() {
        assertEquals(compo2.getId(),"c2");
    }
}
