package com.mytests.spring.autowiredConstructorsInTests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UseConfigurationPropertyTest {

    private final Compo1 compo1;
    private final Compo2 compo2;

    // works if the spring.test.constructor.autowire.mode=all is set
    UseConfigurationPropertyTest(Compo1 compo1, Compo2 compo2) {
        this.compo1 = compo1;
        this.compo2 = compo2;
    }

    // necessary if the spring.test.constructor.autowire.mode=all is not set
   /* public UseConfigurationPropertyTest(@Autowired Compo1 compo1, @Autowired Compo2 compo2) {
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
