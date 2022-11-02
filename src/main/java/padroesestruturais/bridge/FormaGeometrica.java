package padroesestruturais.bridge;

public abstract class FormaGeometrica {

    protected Coloracao coloracao;

    protected String nome;
    protected float comprimento;

    public FormaGeometrica(String nome, float comprimento, Coloracao coloracao) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.coloracao = coloracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setColoracao(Coloracao coloracao) {
        this.coloracao = coloracao;
    }

    public abstract String calcularPerimetro();
}
