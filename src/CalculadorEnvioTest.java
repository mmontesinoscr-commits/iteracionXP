import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadorEnvioTest {

    @Test
    public void testClienteEstandar() {
        assertEquals(100.0, CalculadorEnvio.calcularCostoEnvio(499.99, false), 0.01);
        assertEquals(50.0, CalculadorEnvio.calcularCostoEnvio(700.0, false), 0.01);
        assertEquals(0.0, CalculadorEnvio.calcularCostoEnvio(1500.0, false), 0.01);
    }

    @Test
    public void testClientePremiumEnvioGratis() {
        // Nuevo requerimiento: Premium siempre es $0.0 sin importar el costo
        assertEquals(0.0, CalculadorEnvio.calcularCostoEnvio(499.99, true), 0.01);
    }
}

class CalculadorEnvio {
    public static double calcularCostoEnvio(double importe, boolean esPremium) {
        if (esPremium || importe >= 1000.0) {
            return 0.0;
        }
        if (importe >= 500.0) {
            return 50.0;
        }
        return 100.0;
    }
}