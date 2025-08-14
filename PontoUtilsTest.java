package br.com.seunome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PontoUtilsTest {

    @Test
    public void testeExemplo1() {
        double dist = PontoUtils.calcularDistancia(1.0, 7.0, 5.0, 9.0);
        assertEquals(4.4721, dist, 0.0001);
    }

    @Test
    public void testeExemplo2() {
        double dist = PontoUtils.calcularDistancia(-2.5, 0.4, 12.1, 7.3);
        assertEquals(16.1484, dist, 0.0001);
    }

    @Test
    public void testeExemplo3() {
        double dist = PontoUtils.calcularDistancia(2.5, -0.4, -12.2, 7.0);
        assertEquals(16.4575, dist, 0.0001);
    }
}
