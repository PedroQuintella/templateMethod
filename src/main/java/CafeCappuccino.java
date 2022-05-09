public class CafeCappuccino extends Cafe {

    public double calcularValorTotal() {
        return this.getValor() + 2.20;
    }

    @Override
    public String getTipo() {
        return "CafeCappuccino";
    }
}
