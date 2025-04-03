import org.junit.Assert;
import org.junit.Test;
import personagens.Gimli;

public class GimliTest {

    @Test
    public void deveCriarGimliEFalarSobrio() {

        String falaEsperada = "Let them come. There is one Dwarf yet in Moria who still draws breath.";
        Gimli gimli = new Gimli();

        Assert.assertEquals(falaEsperada, gimli.falar());
    }

    @Test
    public void deveCriarGimliEImprimirToString() {

        String toStringEsperada = "I";
        Gimli gimli = new Gimli();

        Assert.assertEquals(toStringEsperada, gimli.toString());
    }

    @Test
    public void deveCriarGimliEFalarSobrioQuandoBeberDuasVezes() {

        String falaEsperada = "Let them come. There is one Dwarf yet in Moria who still draws breath.";
        Gimli gimli = new Gimli();
        gimli.beber();
        gimli.beber();

        Assert.assertEquals(falaEsperada, gimli.falar());
    }

    @Test
    public void deveCriarGimliEFalarBebadoQuandoBeberTresVezes() {

        String falaEsperada = "What did I say? He can't hold his liquor!";
        Gimli gimli = new Gimli();
        gimli.beber();
        gimli.beber();
        gimli.beber();

        Assert.assertEquals(falaEsperada, gimli.falar());
    }
}
