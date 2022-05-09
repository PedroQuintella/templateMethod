public class CafeComum extends Cafe {

    public double calcularValorTotal() {
        return this.getValor();
    }

    @Override
    public String getTipo() {
        return "CafeComum";
    }
}
