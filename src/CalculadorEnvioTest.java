import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadorEnvioTest {

    @Test
    public void testCalcularCostoEnvio() {
        assertEquals(100.0, CalculadorEnvio.calcularCostoEnvio(499.99), 0.01);
        assertEquals(50.0, CalculadorEnvio.calcularCostoEnvio(700.0), 0.01);
        assertEquals(0.0, CalculadorEnvio.calcularCostoEnvio(1500.0), 0.01);
    }
}

class CalculadorEnvio {
    public static double calcularCostoEnvio(double importe) {
        return -1.0;
    }
}
