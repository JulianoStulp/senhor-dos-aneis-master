import org.junit.Assert;
import org.junit.Test;
import personagens.Orc;

public class OrcTest {

    @Test
    public void deveCriarOrcEGrunir() {

        String grunidoEsperado = "Arrrggghhh";
        Orc orc = new Orc();

        Assert.assertEquals(grunidoEsperado, orc.grunir());
    }

    @Test
    public void deveCriarOrcEImprimirToString() {

        String toStringEsperada = "O";
        Orc orc = new Orc();

        Assert.assertEquals(toStringEsperada, orc.toString());
    }
}
