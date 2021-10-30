package com.bethaCode.projeto.model.util;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BigDecimalConverter {
    public BigDecimal converter(String valor){
        valor = valor.replace(".", "").replace(",", ".");
        return new BigDecimal(valor);
    }
}
