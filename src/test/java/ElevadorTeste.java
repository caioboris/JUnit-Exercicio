import br.com.fiap.Elevador;
import br.com.fiap.Pessoa;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ElevadorTeste {

    private Elevador elevador;

    @Before
    public void setUp() throws Exception{
        elevador = new Elevador();
    }

    @Test
    public void TesteEntrarNoElevador180kg(){
        elevador.setCargaAtual(100);
        Pessoa p = new Pessoa("Caio", 80);
        elevador.setCargaAtual(elevador.entrarNoElevador(p.getPeso()));
        assertEquals(180.0, elevador.getCargaAtual());
    }

    @Test
    public void TesteSairDoElevador100kg(){
        elevador.setCargaAtual(180);
        Pessoa p = new Pessoa("Caio", 80);
        elevador.setCargaAtual(elevador.sairDoElevador(p.getPeso()));
        assertEquals(100.0, elevador.getCargaAtual());
    }

    @Test
    public void TesteAvaliarPesoSinalAlertaTrue(){
        elevador.setCargaAtual(300.00);
        boolean alerta = elevador.avaliarPeso(elevador.getCargaAtual());
        assertTrue(alerta);

    }

}
