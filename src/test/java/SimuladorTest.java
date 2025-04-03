import exception.*;
import mapa.Mapa;
import org.junit.Assert;
import org.junit.Test;
import personagens.*;
import simulador.Simulador;

public class SimuladorTest {

    @Test
    public void deveVencerSociedadeQuandoAragornELegolasBatalharemContraOrcEGoblim()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|A|L| | | | | |O| |M|"
        String resultadoEsperado = "| | | | |A| | | | |L|";

        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, aragorn);
        mapa.inserir(1, legolas);
        mapa.inserir(7, orc);
        mapa.inserir(9, goblim);
        simulador.simular();

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoInimigosDerrotaremMembrosDaSociedade()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início: "|A| |I| | | | |U|O|M|"
        // Fim:    "| | | | | | |O|M| | |"

        Aragorn aragorn = new Aragorn();
        Gimli gimli = new Gimli();
        Urukhai urukhai = new Urukhai();
        Orc orc = new Orc();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, aragorn);
        mapa.inserir(2, gimli);
        mapa.inserir(7, urukhai);
        mapa.inserir(8, orc);
        mapa.inserir(9, goblim);
        simulador.simular();
    }

    @Test
    public void deveVencerSociedadeQuandoGandalfBatalharSozinhoContraSaruman()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|G| | | | | | | | |S|"
        String resultadoEsperado = "| | | | | | | | | |G|";

        Gandalf gandalf = new Gandalf();
        Saruman saruman = new Saruman();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, gandalf);
        mapa.inserir(9, saruman);
        simulador.simular();

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoLegolasBatalharSozinhoContraOrcEUrukhai()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|L| | | | | | | |U|O|"
        // Fim:     "| | | | | |U| | | | |";

        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Urukhai urukhai = new Urukhai();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, legolas);
        mapa.inserir(8, urukhai);
        mapa.inserir(9, orc);
        simulador.simular();
    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoBoromirBatalharSozinhoContraUrukhai()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|B| | | | | | | | |U|"
        // Fim:     "| | | | |U| | | | | |";

        Boromir boromir = new Boromir();
        Urukhai urukhai = new Urukhai();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, boromir);
        mapa.inserir(9, urukhai);
        simulador.simular();
    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoBoromirBatalharSozinhoContraSaruman()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|B| | | | | | | | |S|"

        Boromir boromir = new Boromir();
        Saruman saruman = new Saruman();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, boromir);
        mapa.inserir(9, saruman);
        simulador.simular();

    }

    @Test
    public void deveVencerSociedadeQuandoGandalfELegolasBatalharContraSarumanUrukhaiEGoblim()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|G| | |L| |U| | |G|S|"
        String resultadoEsperado = "|G| | | | | | | | |L|";

        Gandalf gandalf = new Gandalf();
        Legolas legolas = new Legolas();
        Urukhai urukhai = new Urukhai();
        Goblim goblim = new Goblim();
        Saruman saruman = new Saruman();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, gandalf);
        mapa.inserir(3, legolas);
        mapa.inserir(5, urukhai);
        mapa.inserir(8, goblim);
        mapa.inserir(9, saruman);
        simulador.simular();

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test
    public void deveVencerSociedadeQuandoLegolasBatalharSozinhoContraSarumanEGoblim()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "| | | |M|L| | | | |S|"
        String resultadoEsperado = "|M| | | | | | | | |L|";

        Goblim goblim = new Goblim();
        Legolas legolas = new Legolas();
        Saruman saruman = new Saruman();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(3, goblim);
        mapa.inserir(4, legolas);
        mapa.inserir(9, saruman);
        simulador.simular();

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test
    public void deveVencerSociedadeQuandoAragornELegolasBatalharemContraSarumanOrcEGoblim()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|S|A|L| | | | | |O|M|"
        String resultadoEsperado = "|S| | | | |A| | | |L|";

        Saruman saruman = new Saruman();
        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, saruman);
        mapa.inserir(1, aragorn);
        mapa.inserir(2, legolas);
        mapa.inserir(8, orc);
        mapa.inserir(9, goblim);
        simulador.simular();

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test
    public void deveVencerSociedadeQuandoAragornELegolasBatalharemContraUrukhaiOrcEGoblim()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|A|L| | |U|O|M| | | |"
        String resultadoEsperado = "| | | | | | | | | |A|";

        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Urukhai urukhai = new Urukhai();
        Orc orc = new Orc();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, aragorn);
        mapa.inserir(1, legolas);
        mapa.inserir(4, urukhai);
        mapa.inserir(5, orc);
        mapa.inserir(6, goblim);
        simulador.simular();

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test
    public void deveVencerSociedadeQuandoLegolasBatalharSozinhoContraGoblim()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|L| | | | | | | | |M|"
        String resultadoEsperado = "| | | | | | | | | |L|";

        Legolas legolas = new Legolas();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, legolas);
        mapa.inserir(9, goblim);
        simulador.simular();

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test
    public void deveVencerSociedadeQuandoLegolasEGimliBatalharemContraUrukhaiEGoblim()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|L| |I| | | | |U| |M|"
        String resultadoEsperado = "| | | | | | | |L| |I|";

        Legolas legolas = new Legolas();
        Gimli gimli = new Gimli();
        Urukhai urukhai = new Urukhai();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();
        Simulador simulador = new Simulador(mapa);

        mapa.inserir(0, legolas);
        mapa.inserir(2, gimli);
        mapa.inserir(7, urukhai);
        mapa.inserir(9, goblim);
        simulador.simular();

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }
}
