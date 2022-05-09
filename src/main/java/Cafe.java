public abstract class Cafe {
    private String nome;
    private double valor = 2.00;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double calcularValorTotal();

    public abstract String getTipo();

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", valor=" + this.calcularValorTotal() +
                '}';
    }
}
