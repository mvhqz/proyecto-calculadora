package com.calculadora.proyecto_calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCalcularAreaCirculo() {
        double radio = 5.0;
        double resultadoEsperado = Math.PI * radio * radio;
        double resultadoObtenido = App.calcularAreaCirculo(radio);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.001);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        double lado = 4.0;
        double resultadoEsperado = lado * lado;
        double resultadoObtenido = App.calcularAreaCuadrado(lado);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.001);
    }

    @Test
    public void testCalcularAreaRectangulo() {
        double base = 6.0;
        double altura = 3.0;
        double resultadoEsperado = base * altura;
        double resultadoObtenido = App.calcularAreaRectangulo(base, altura);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.001);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        double base = 8.0;
        double altura = 5.0;
        double resultadoEsperado = (base * altura) / 2;
        double resultadoObtenido = App.calcularAreaTriangulo(base, altura);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.001);
    }
}
