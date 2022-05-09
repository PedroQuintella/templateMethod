public class CafeComCanela extends Cafe {

    public double calcularValorTotal() {
        return this.getValor() + 0.50;
    }

    @Override
    public String getTipo() {
        return "CafeComCanela";
    }
}
