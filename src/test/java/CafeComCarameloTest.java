import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeComCarameloTest {

    @Test
    void deveRetornarValorTotalCafeComCaramelo() {
        CafeComCaramelo cafeComCaramelo = new CafeComCaramelo();

        assertEquals(2.70, cafeComCaramelo.calcularValorTotal());
    }

    @Test
    void  deveRetornarInformacoesCafeComCaramelo() {
        CafeComCaramelo cafeComCaramelo = new CafeComCaramelo();
        cafeComCaramelo.setNome("Café com Caramelo");

        assertEquals("CafeComCaramelo{nome='Café com Caramelo', valor=2.7}", cafeComCaramelo.getInfo());
    }
}