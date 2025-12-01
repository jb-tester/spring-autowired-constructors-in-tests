package com.mytests.spring.autowiredConstructorsInTests;

import org.springframework.stereotype.Component;

@Component("conditionService")
public class ConditionService {

    public boolean isConditionMet() {
        return true;
    }
}