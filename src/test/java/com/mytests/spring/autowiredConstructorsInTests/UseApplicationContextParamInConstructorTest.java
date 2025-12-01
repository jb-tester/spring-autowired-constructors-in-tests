package com.mytests.spring.autowiredConstructorsInTests;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UseApplicationContextParamInConstructorTest {

    ApplicationContext ctx;

    // here the @Autowired annotation is not required since the parameter is of ApplicationContext type

    public UseApplicationContextParamInConstructorTest(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Test
    void testContextBeans() {
        assertNotNull(ctx);
        assertEquals("c1", ctx.getBean(Compo1.class).getId());
    }
}
