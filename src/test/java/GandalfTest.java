import org.junit.Assert;
import org.junit.Test;
import personagens.Gandalf;

public class GandalfTest {

    @Test
    public void deveCriarGandalfEFalar() {

        String falaEsperada = "A Wizard is never late, nor is he early. He arrives precisely when he means to.";
        Gandalf gandalf = new Gandalf();

        Assert.assertEquals(falaEsperada, gandalf.falar());
    }

    @Test
    public void deveCriarGandalfEImprimirToString() {

        String toStringEsperada = "G";
        Gandalf gandalf = new Gandalf();

        Assert.assertEquals(toStringEsperada, gandalf.toString());
    }

    @Test
    public void deveCriarGandalfERessusitarQuandoConstituicaoForIgualAZero() {

        Gandalf gandalf = new Gandalf();
        Gandalf gandalfEsperado = gandalf;

        gandalf.setConstituicao(0);

        Gandalf gandalfRessusitado = gandalf.ressucitar();

        Assert.assertNotEquals(gandalfEsperado, gandalfRessusitado);
    }

    @Test
    public void deveCriarGandalfENaoRessusitarQuandoConstituicaoForIgualA1() {

        Gandalf gandalf = new Gandalf();

        gandalf.setConstituicao(1);

        Gandalf gandalfRessusitado = gandalf.ressucitar();

        Assert.assertNull(gandalfRessusitado);
    }

}
