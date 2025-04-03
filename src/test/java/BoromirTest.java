import org.junit.Assert;
import org.junit.Test;
import personagens.Boromir;

public class BoromirTest {

    @Test
    public void deveCriarBoromirEFalar() {

        String falaEsperada = "One does not simply walk into Mordor.";
        Boromir boromir = new Boromir();

        Assert.assertEquals(falaEsperada, boromir.falar());
    }

    @Test
    public void deveCriarBoromirEImprimirToString() {

        String toStringEsperada = "B";
        Boromir boromir = new Boromir();

        Assert.assertEquals(toStringEsperada, boromir.toString());
    }

    @Test
    public void deveCriarBoromirEPerderConstituicaoQuandoEnvelhecer() {

        int constituicaoEsperada = 38;
        Boromir boromir = new Boromir();

        boromir.envelhecer();

        Assert.assertEquals(constituicaoEsperada, boromir.getConstituicao());
    }

    @Test
    public void deveCriarBoromirEPerderConstituicaoQuandoEnvelhecerMaisDeUmaVez() {

        int constituicaoEsperada = 36;
        Boromir boromir = new Boromir();

        boromir.envelhecer();
        boromir.envelhecer();

        Assert.assertEquals(constituicaoEsperada, boromir.getConstituicao());
    }

    @Test
    public void deveCriarBoromirENaoenvelecherQuandoConstituicaoForIgualAZero() {

        int constituicaoEsperada = 0;
        Boromir boromir = new Boromir();

        boromir.setConstituicao(0);
        boromir.envelhecer();

        Assert.assertEquals(constituicaoEsperada, boromir.getConstituicao());
    }
}
