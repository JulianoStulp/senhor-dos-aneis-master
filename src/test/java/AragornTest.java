import org.junit.Assert;
import org.junit.Test;
import personagens.Aragorn;

public class AragornTest {

    @Test
    public void deveCriarAragornEFalar() {

        String falaEsperada = "A day may come when the courage of men fails… but it is not THIS day.";
        Aragorn aragorn = new Aragorn();

        Assert.assertEquals(falaEsperada, aragorn.falar());
    }

    @Test
    public void deveCriarAragornEImprimirToString() {

        String toStringEsperada = "A";
        Aragorn aragorn = new Aragorn();

        Assert.assertEquals(toStringEsperada, aragorn.toString());
    }

    @Test
    public void deveCriarAragornEPerderConstituicaoQuandoEnvelhecer() {

        int constituicaoEsperada = 59;
        Aragorn aragorn = new Aragorn();

        aragorn.envelhecer();

        Assert.assertEquals(constituicaoEsperada, aragorn.getConstituicao());
    }

    @Test
    public void deveCriarAragornEPerderConstituicaoQuandoEnvelhecerMaisDeUmaVez() {

        int constituicaoEsperada = 58;
        Aragorn aragorn = new Aragorn();

        aragorn.envelhecer();
        aragorn.envelhecer();

        Assert.assertEquals(constituicaoEsperada, aragorn.getConstituicao());
    }

    @Test
    public void deveCriarAragornENaoenvelecherQuandoConstituicaoForIgualAZero() {

        int constituicaoEsperada = 0;
        Aragorn aragorn = new Aragorn();

        aragorn.setConstituicao(0);
        aragorn.envelhecer();

        Assert.assertEquals(constituicaoEsperada, aragorn.getConstituicao());
    }
}
