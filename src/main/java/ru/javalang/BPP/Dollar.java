package ru.javalang.BPP;

import org.springframework.stereotype.Component;

@Component
@Currency
public class Dollar {
    @CurrencyField
    private int[] value={31,33,32,34};
}
