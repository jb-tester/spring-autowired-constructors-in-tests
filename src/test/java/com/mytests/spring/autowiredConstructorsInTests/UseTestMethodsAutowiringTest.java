package com.mytests.spring.autowiredConstructorsInTests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class UseTestMethodsAutowiringTest {

    // no gutter navigation icons
    // no error for n/a bean
    @Test
    public void test1(@Autowired Compo1 compo1,
                      @Autowired Compo2 compo2,
                       @Autowired(required = false) NotBeanClass nb){
        assertNotNull(compo1);
        assertNotNull(compo2);
        assertNull(nb);

    }
}
