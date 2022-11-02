package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void deveRetornarTrianguloAmbar() {
        Coloracao coloracao = new Ambar();
        Triangulo tri = new Triangulo("Triangulo", 4, coloracao);
        tri.setColoracao(coloracao);
        assertEquals("A figura Triangulo é Ambar e tem perimetro: 12.0 cm.", tri.calcularPerimetro());
    }

    @Test
    void deveRetornarTrianguloAmetista() {
        Coloracao coloracao = new Ametista();
        Triangulo tri = new Triangulo("Triangulo", 4, coloracao);
        tri.setColoracao(coloracao);
        assertEquals("A figura Triangulo é Ametista e tem perimetro: 12.0 cm.", tri.calcularPerimetro());
    }

    @Test
    void deveRetornarTrianguloAzul() {
        Coloracao coloracao = new Azul();
        Triangulo tri = new Triangulo("Triangulo", 4, coloracao);
        tri.setColoracao(coloracao);
        assertEquals("A figura Triangulo é Azul e tem perimetro: 12.0 cm.", tri.calcularPerimetro());
    }

    @Test
    void deveRetornarTrianguloAmarelo() {
        Coloracao coloracao = new Amarelo();
        Triangulo tri = new Triangulo("Triangulo", 4, coloracao);
        tri.setColoracao(coloracao);
        assertEquals("A figura Triangulo é Amarelo e tem perimetro: 12.0 cm.", tri.calcularPerimetro());
    }

}