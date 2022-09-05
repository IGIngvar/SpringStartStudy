package ru.javalang.BPP.Currency;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Currency
public class Dollar {
    @CurrencyField
    private int[] value={31,33,32,34};

    @Override
    public String toString() {
        return "Dollar values:" + Arrays.toString(value);
    }
}
