package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadradoTest {

    @Test
    void deveRetornarQuadradoAmbar(){
        Coloracao coloracao = new Ambar();
        Quadrado quad = new Quadrado("Quadrado", 4, coloracao);
        quad.setColoracao(coloracao);
        assertEquals("A figura Quadrado é Ambar e tem perimetro: 16.0 cm.", quad.calcularPerimetro());
    }

    @Test
    void deveRetornarQuadradoAmetista(){
        Coloracao coloracao = new Ametista();
        Quadrado quad = new Quadrado("Quadrado", 4, coloracao);
        quad.setColoracao(coloracao);
        assertEquals("A figura Quadrado é Ametista e tem perimetro: 16.0 cm.", quad.calcularPerimetro());
    }

    @Test
    void deveRetornarQuadradoAzul(){
        Coloracao coloracao = new Azul();
        Quadrado quad = new Quadrado("Quadrado", 4, coloracao);
        quad.setColoracao(coloracao);
        assertEquals("A figura Quadrado é Azul e tem perimetro: 16.0 cm.", quad.calcularPerimetro());
    }

    @Test
    void deveRetornarQuadradoAmarelo(){
        Coloracao coloracao = new Amarelo();
        Quadrado quad = new Quadrado("Quadrado", 4, coloracao);
        quad.setColoracao(coloracao);
        assertEquals("A figura Quadrado é Amarelo e tem perimetro: 16.0 cm.", quad.calcularPerimetro());
    }

}