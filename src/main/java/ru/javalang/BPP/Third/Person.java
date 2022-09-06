package ru.javalang.BPP.Third;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Person {

    private String name;

    @Bean
    @Scope("singleton")
    public Person personSingleton() {
        return new Person();
    }

    @Bean
    @Scope("prototype")
    public Person personPrototype() {
        return new Person();
    }


    public void setName(String name) {
        this.name = name;
    }

    public Object getName() {
        return name;
    }
}