package ru.javalang.BPP.Third;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;

public class Test {




    private static final String NAME = "John Smith";

    @Test
    public void givenSingletonScope_whenSetName_thenEqualNames() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("scopes.xml");

        Person personSingletonA = (Person) applicationContext.getBean("personSingleton");
        Person personSingletonB = (Person) applicationContext.getBean("personSingleton");

        personSingletonA.setName(NAME);
        Assert.assertEquals(NAME, personSingletonB.getName());

        ((AbstractApplicationContext) applicationContext).close();
    }
}
