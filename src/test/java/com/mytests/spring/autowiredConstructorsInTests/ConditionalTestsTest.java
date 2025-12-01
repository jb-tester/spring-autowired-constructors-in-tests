package com.mytests.spring.autowiredConstructorsInTests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.DisabledIf;
import org.springframework.test.context.junit.jupiter.EnabledIf;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ConditionalTestsTest {

    @Autowired
    private Compo1 compo1;

    @Test
    @EnabledIf(loadContext = true, expression = "#{@conditionService.isConditionMet}", reason = "SpEL condition is met")
    void enablingBySpElTest() {
        assertNotNull(compo1.getId());
    }
    @Test
    @DisabledIf(expression = "#{systemProperties['os.name'].toLowerCase().contains('win')}", reason = "SpEL condition is not met")
    void disablingBySpelTest() {
        assertNotNull(compo1.getId());
    }
    @Test
    @EnabledIf(value = "${my.props.condition:true}", reason = "property condition is met")
    void enablingByPropertyTest() {
        assertNotNull(compo1.getId());
    }
}
