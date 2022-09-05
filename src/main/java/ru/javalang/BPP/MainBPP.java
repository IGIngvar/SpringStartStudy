package ru.javalang.BPP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javalang.BPP.Currency.CurrencyBeanPostProcessor;
import ru.javalang.BPP.Currency.Dollar;
import ru.javalang.BPP.second.ColorFactory;
import ru.javalang.BPP.second.InjectRandomIntBeanPostProcessor;
import ru.javalang.BPP.second.MyBean;

public class MainBPP {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Dollar.class, CurrencyBeanPostProcessor.class);
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(InjectRandomIntBeanPostProcessor.class, MyBean.class);
        System.out.println(applicationContext1.getBean(MyBean.class));
        System.out.println(applicationContext.getBean(Dollar.class));



    }
}
