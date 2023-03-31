package com.games.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteCalculadora {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(1, 1);
        assertEquals(2, resultado);
    }
    
}
