package padroesestruturais.bridge;

public class Quadrado extends FormaGeometrica {

    private int num_arestas = 4;

    public Quadrado(String nome, float comprimento, Coloracao coloracao) {
        super(nome, comprimento, coloracao);
    }

    public String calcularPerimetro() {
        float perimetro = this.num_arestas * this.comprimento;
        return "A figura " + this.nome + " é " + coloracao.corEscolhida() + " e tem perimetro: " + perimetro + " cm.";
    }
}
