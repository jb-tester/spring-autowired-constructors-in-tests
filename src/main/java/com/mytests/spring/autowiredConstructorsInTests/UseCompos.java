package com.mytests.spring.autowiredConstructorsInTests;

import org.springframework.stereotype.Component;

@Component
public class UseCompos {


    private final Compo1 compo1;
    private final Compo2 compo2;

    public UseCompos(Compo1 compo1, Compo2 compo2) {
        this.compo1 = compo1;
        this.compo2 = compo2;
    }

    String display(){
        String rez = compo1.getId()+" "+compo2.getId();
        return rez;
    }
}
