package com.mytests.spring.autowiredConstructorsInTests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestConstructor;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * *
 * <p>Created by irina on 12/8/2022.</p>
 * <p>Project: spring-autowired-constructors-in-tests</p>
 * *
 */
@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
//@TestConstructor(autowireMode = TestConstructor.AutowireMode.ANNOTATED)
public class UseTestConstructorAnnotationTest {
    private final Compo1 compo1;
    private final Compo2 compo2;

    // works if the autowireMode=ALL
    UseTestConstructorAnnotationTest(Compo1 compo1, Compo2 compo2) {
        this.compo1 = compo1;
        this.compo2 = compo2;
    }

    // necessary if the autowireMode=ANNOTATED
    /*public UseAnnotationTest(@Autowired Compo1 compo1, @Autowired Compo2 compo2) {
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
