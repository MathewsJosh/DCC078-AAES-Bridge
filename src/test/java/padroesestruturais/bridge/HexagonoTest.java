package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HexagonoTest {

    @Test
    void deveRetornarHexagonoAmbar() {
        Coloracao coloracao = new Ambar();
        Hexagono hex = new Hexagono("Hexagono", 4, coloracao);
        hex.setColoracao(coloracao);
        assertEquals("A figura Hexagono é Ambar e tem perimetro: 24.0 cm.", hex.calcularPerimetro());
    }

    @Test
    void deveRetornarHexagonoAmetista() {
        Coloracao coloracao = new Ametista();
        Hexagono hex = new Hexagono("Hexagono", 4, coloracao);
        hex.setColoracao(coloracao);
        assertEquals("A figura Hexagono é Ametista e tem perimetro: 24.0 cm.", hex.calcularPerimetro());
    }

    @Test
    void deveRetornarHexagonoAzul() {
        Coloracao coloracao = new Azul();
        Hexagono hex = new Hexagono("Hexagono", 4, coloracao);
        hex.setColoracao(coloracao);
        assertEquals("A figura Hexagono é Azul e tem perimetro: 24.0 cm.", hex.calcularPerimetro());
    }

    @Test
    void deveRetornarHexagonoAmarelo() {
        Coloracao coloracao = new Amarelo();
        Hexagono hex = new Hexagono("Hexagono", 4, coloracao);
        hex.setColoracao(coloracao);
        assertEquals("A figura Hexagono é Amarelo e tem perimetro: 24.0 cm.", hex.calcularPerimetro());
    }

}