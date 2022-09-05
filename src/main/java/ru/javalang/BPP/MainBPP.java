package ru.javalang.BPP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javalang.BPP.Currency.CurrencyBeanPostProcessor;
import ru.javalang.BPP.Currency.Dollar;

public class MainBPP {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Dollar.class, CurrencyBeanPostProcessor.class);
        System.out.println(applicationContext.getBean(Dollar.class));

    }
}
