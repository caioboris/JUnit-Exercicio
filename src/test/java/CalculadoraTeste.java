import br.com.fiap.Calculadora;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {

    private Calculadora calc;

    @Before
    public void setUp() throws Exception{
        calc = new Calculadora();
    }

    @Test
    public void TesteSomar10com15(){
        double soma = calc.soma(10.0, 15.0);
        assertEquals(25, soma);
    }

    @Test
    public void TesteSubtrair17com7(){
        double subtrair = calc.subtrair(17.0, 7.0);
        assertEquals(10, subtrair);
    }
}
