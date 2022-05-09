public class CafeComCaramelo extends Cafe {

    public double calcularValorTotal() {
        return this.getValor() + 0.70;
    }

    @Override
    public String getTipo() {
        return "CafeComCaramelo";
    }
}
