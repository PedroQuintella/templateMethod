import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeComCanelaTest {

    @Test
    void deveRetornarValorTotalCafeComCanela() {
        CafeComCanela cafeComCanela = new CafeComCanela();

        assertEquals(2.50, cafeComCanela.calcularValorTotal());
    }

    @Test
    void  deveRetornarInformacoesCafeComCanela() {
        CafeComCanela cafeComCanela = new CafeComCanela();
        cafeComCanela.setNome("Café com Canela");

        assertEquals("CafeComCanela{nome='Café com Canela', valor=2.5}", cafeComCanela.getInfo());
    }
}