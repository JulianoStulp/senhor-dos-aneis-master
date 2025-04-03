import org.junit.Assert;
import org.junit.Test;
import personagens.Saruman;

public class SarumanTest {

    @Test
    public void deveCriarSarumanEFalar() {

        String falaEsperada = "Against the power of Mordor there can be no victory.";
        Saruman saruman = new Saruman();

        Assert.assertEquals(falaEsperada, saruman.falar());
    }

    @Test
    public void deveCriarSarumanEImprimirToString() {

        String toStringEsperada = "S";
        Saruman saruman = new Saruman();

        Assert.assertEquals(toStringEsperada, saruman.toString());
    }

    @Test
    public void deveCriarSarumanENaoRessusitarQuandoTentarRessusitar() {

        Saruman saruman = new Saruman();

        saruman.setConstituicao(1);

        Saruman gandalfRessusitado = saruman.ressucitar();

        Assert.assertNull(gandalfRessusitado);
    }

}
