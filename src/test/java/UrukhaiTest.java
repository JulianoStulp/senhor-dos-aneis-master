import org.junit.Assert;
import org.junit.Test;
import personagens.Urukhai;

public class UrukhaiTest {

    @Test
    public void deveCriarUrukhaiEGrunir() {

        String grunidoEsperado = "Uuurrrrrr";
        Urukhai urukhai = new Urukhai();

        Assert.assertEquals(grunidoEsperado, urukhai.grunir());
    }

    @Test
    public void deveCriarUrukhaiEImprimirToString() {

        String toStringEsperada = "U";
        Urukhai urukhai = new Urukhai();

        Assert.assertEquals(toStringEsperada, urukhai.toString());
    }

    @Test
    public void deveCriarUrukhaiEFalar() {

        String falaEsperada = "Looks like meat's back on the menu boys!";
        Urukhai urukhai = new Urukhai();

        Assert.assertEquals(falaEsperada, urukhai.falar());
    }

    @Test
    public void deveCriarUrukhaiEPerderConstituicaoQuandoEnvelhecer() {

        int constituicaoEsperada = 43;
        Urukhai urukhai = new Urukhai();

        urukhai.envelhecer();

        Assert.assertEquals(constituicaoEsperada, urukhai.getConstituicao());
    }

    @Test
    public void deveCriarUrukhaiEPerderConstituicaoQuandoEnvelhecerMaisDeUmaVez() {

        int constituicaoEsperada = 41;
        Urukhai urukhai = new Urukhai();

        urukhai.envelhecer();
        urukhai.envelhecer();

        Assert.assertEquals(constituicaoEsperada, urukhai.getConstituicao());
    }

    @Test
    public void deveCriarUrukhaiENaoenvelecherQuandoConstituicaoForIgualAZero() {

        int constituicaoEsperada = 0;
        Urukhai urukhai = new Urukhai();

        urukhai.setConstituicao(0);
        urukhai.envelhecer();

        Assert.assertEquals(constituicaoEsperada, urukhai.getConstituicao());
    }
}
