package com.mytests.spring.autowiredConstructorsInTests;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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

    // both beans and junit params
    @RepeatedTest(2)
    void placeOrderRepeatedly(RepetitionInfo repetitionInfo,
                              @Autowired Compo1 compo1) {

        assertEquals("c1", compo1.getId());
    }
}
