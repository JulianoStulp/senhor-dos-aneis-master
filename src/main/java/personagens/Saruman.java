package personagens;

import classes.Mago;
import racas.Maia;

public class Saruman extends Personagem implements Maia, Mago {

    private static final int FORCA_INICIAL = 2;
    private static final int AGILIDADE_INICIAL = 2;
    private static final int INTELIGENCIA_INICIAL = 9;
    private static final int CONSTITUICAO_INICIAL = 70;
    private static final boolean IS_SOCIEDADE_DO_ANEL_INICIAL = false;

    public Saruman() {
        super(FORCA_INICIAL, AGILIDADE_INICIAL, INTELIGENCIA_INICIAL, CONSTITUICAO_INICIAL, IS_SOCIEDADE_DO_ANEL_INICIAL);
    }

    @Override
    public Saruman ressucitar() {
        return null;
    }

    @Override
    public String falar() {
        return "Against the power of Mordor there can be no victory.";
    }

    @Override
    public String toString() {
        return "S";
    }

}
