import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeComumTest {

    @Test
    void deveRetornarValorTotalCafeComum() {
        CafeComum cafeComum = new CafeComum();

        assertEquals(2.0, cafeComum.calcularValorTotal());
    }

    @Test
    void  deveRetornarInformacoesCafeComum() {
        CafeComum cafeComum = new CafeComum();
        cafeComum.setNome("Café comum");

        assertEquals("CafeComum{nome='Café comum', valor=2.0}", cafeComum.getInfo());
    }
}