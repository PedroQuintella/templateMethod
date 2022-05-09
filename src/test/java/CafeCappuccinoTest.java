import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeCappuccinoTest {

    @Test
    void deveRetornarValorTotalCafeCappuccino() {
        CafeCappuccino cafeCappuccino = new CafeCappuccino();

        assertEquals(4.20, cafeCappuccino.calcularValorTotal());
    }

    @Test
    void  deveRetornarInformacoesCafeCappuccino() {
        CafeCappuccino cafeCappuccino = new CafeCappuccino();
        cafeCappuccino.setNome("Café Cappuccino");

        assertEquals("CafeCappuccino{nome='Café Cappuccino', valor=4.2}", cafeCappuccino.getInfo());
    }
}