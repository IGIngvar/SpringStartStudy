package ru.javalang.BPP.Currency;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;

@Component
public class CurrencyBeanPostProcessor implements BeanPostProcessor {

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(Currency.class)) {
            Field[] fields = bean.getClass().getDeclaredFields();

            for(int i = 0; i < fields.length; i++){
                if (fields[i].isAnnotationPresent(CurrencyField.class)){
                    fields[i].setAccessible(true);
                    try {
                        sort((int[]) fields[i].get(bean));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        return bean;
    }
    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    public void sort(int[] array){
        Arrays.sort(array);
    }
}
