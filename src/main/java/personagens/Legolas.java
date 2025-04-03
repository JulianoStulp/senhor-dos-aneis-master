package personagens;

import classes.Arqueiro;
import racas.Elfo;

public class Legolas extends Personagem implements Elfo, Arqueiro {

    private static final int FORCA_INICIAL = 5;
    private static final int AGILIDADE_INICIAL = 10;
    private static final int INTELIGENCIA_INICIAL = 6;
    private static final int CONSTITUICAO_INICIAL = 80;
    private static final boolean IS_SOCIEDADE_DO_ANEL_INICIAL = true;

    public Legolas() {
        super(FORCA_INICIAL, AGILIDADE_INICIAL, INTELIGENCIA_INICIAL, CONSTITUICAO_INICIAL, IS_SOCIEDADE_DO_ANEL_INICIAL);
    }

    @Override
    public String falarElfico() {
        return "I amar prestar aen, han mathon ne nem, han mathon ne chae, a han noston ned.";
    }

    @Override
    public String falar() {
        return "They're taking the Hobbits to Isengard!";
    }

    @Override
    public String toString() {
        return "L";
    }

}
