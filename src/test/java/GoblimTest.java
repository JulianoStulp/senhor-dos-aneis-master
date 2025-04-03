import org.junit.Assert;
import org.junit.Test;
import personagens.Goblim;

public class GoblimTest {

    @Test
    public void deveCriarGoblimEGrunir() {

        String grunidoEsperado = "Iiisshhhh";
        Goblim goblim = new Goblim();

        Assert.assertEquals(grunidoEsperado, goblim.grunir());
    }

    @Test
    public void deveCriarGoblimEImprimirToString() {

        String toStringEsperada = "M";
        Goblim goblim = new Goblim();

        Assert.assertEquals(toStringEsperada, goblim.toString());
    }
}
