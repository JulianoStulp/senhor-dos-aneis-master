import exception.PersonagemJaEstaNoMapaException;
import exception.PersonagemNaoEncontradoNoMapaException;
import exception.PosicaoOcupadaException;
import mapa.Mapa;
import org.junit.Assert;
import org.junit.Test;
import personagens.*;

public class MapaTest {

    @Test
    public void deveCriarUmMapaCorretamente() throws PosicaoOcupadaException, PersonagemJaEstaNoMapaException {

        String resultadoEsperado = "|A|L| | | | | |O| |M|";

        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();

        mapa.inserir(0, aragorn);
        mapa.inserir(1, legolas);
        mapa.inserir(7, orc);
        mapa.inserir(9, goblim);

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test(expected = PosicaoOcupadaException.class)
    public void deveLancarPosicaoOcupadaException() throws PosicaoOcupadaException, PersonagemJaEstaNoMapaException {

        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();

        mapa.inserir(0, aragorn);
        mapa.inserir(0, legolas);
        mapa.inserir(7, orc);
        mapa.inserir(9, goblim);

    }

    @Test(expected = PersonagemJaEstaNoMapaException.class)
    public void deveLancarPersonagemJaEstaNoMapaException() throws PosicaoOcupadaException, PersonagemJaEstaNoMapaException {

        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();

        mapa.inserir(0, aragorn);
        mapa.inserir(1, legolas);
        mapa.inserir(2, legolas);
        mapa.inserir(7, orc);
        mapa.inserir(9, goblim);

    }

    @Test(expected = PersonagemNaoEncontradoNoMapaException.class)
    public void deveLancarPersonagemNaoEncontradoNoMapaExceptionQuandoProcuradoPeloPersonagem() throws PosicaoOcupadaException, PersonagemJaEstaNoMapaException, PersonagemNaoEncontradoNoMapaException {

        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Goblim goblim = new Goblim();
        Mapa mapa = new Mapa();

        mapa.inserir(0, aragorn);
        mapa.inserir(7, orc);
        mapa.inserir(9, goblim);

        mapa.buscarPosicao(legolas);

    }


    @Test
    public void deveCriarUmMapaCorretamenteComGandalf() throws PosicaoOcupadaException, PersonagemJaEstaNoMapaException {

        String resultadoEsperado = "|G| | | | | | | | | |";

        Gandalf gandalf = new Gandalf();
        Mapa mapa = new Mapa();

        mapa.inserir(0, gandalf);

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }
}
