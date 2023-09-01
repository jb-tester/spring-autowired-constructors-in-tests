package com.mytests.spring.autowiredConstructorsInTests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringAutowiredConstructorsInTests {

    private final Compo1 compo1;
    private final Compo2 compo2;

    // no gutter navigation icons
    public SpringAutowiredConstructorsInTests(@Autowired Compo1 compo1, @Autowired Compo2 compo2) {
        this.compo1 = compo1;
        this.compo2 = compo2;
    }
    // no errors are shown for String parameter though no String-type bean to inject exists
    /*public SpringAutowiredConstructorsInTests(@Autowired Compo1 compo1, @Autowired Compo2 compo2, String foo) {
        this.compo1 = compo1;
        this.compo2 = compo2;
    }*/

    @Test
    void testCompo1() {
        assertEquals(compo1.getId(),"c1");
    }
    @Test
    void testCompo2() {
        assertEquals(compo2.getId(),"c2");
    }
}
