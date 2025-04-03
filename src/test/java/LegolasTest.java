import org.junit.Assert;
import org.junit.Test;
import personagens.Legolas;

public class LegolasTest {

    @Test
    public void deveCriarLegolasEFalar() {

        String falaEsperada = "They're taking the Hobbits to Isengard!";
        Legolas legolas = new Legolas();

        Assert.assertEquals(falaEsperada, legolas.falar());
    }

    @Test
    public void deveCriarLegolasEImprimirToString() {

        String toStringEsperada = "L";
        Legolas legolas = new Legolas();

        Assert.assertEquals(toStringEsperada, legolas.toString());
    }

    @Test
    public void deveCriarLegolasEFalarElfico() {

        String falaEsperada = "I amar prestar aen, han mathon ne nem, han mathon ne chae, a han noston ned.";
        Legolas legolas = new Legolas();

        Assert.assertEquals(falaEsperada, legolas.falarElfico());
    }
}
