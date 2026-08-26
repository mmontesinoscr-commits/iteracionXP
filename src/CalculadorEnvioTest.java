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
    private static final double LimiteEnvioGratis = 1000.0;
    private static final double LimiteEnvioDescuento = 500.0;

    private static final double CostoEnvioAlto = 100.0;
    private static final double CostoEnvioMedio = 50.0;
    private static final double CostoEnvioGratis = 0.0;

    public static double calcularCostoEnvio(double importe) {
        if (importe >= LimiteEnvioGratis) {
            return CostoEnvioGratis;
        }
        if (importe >= LimiteEnvioDescuento) {
            return CostoEnvioMedio;
        }
        return CostoEnvioAlto;
    }
}
