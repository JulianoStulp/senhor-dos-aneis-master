package personagens;

import classes.Arqueiro;
import racas.Monstro;

public class Goblim extends Personagem implements Monstro, Arqueiro {

    private static final int FORCA_INICIAL = 3;
    private static final int AGILIDADE_INICIAL = 6;
    private static final int INTELIGENCIA_INICIAL = 1;
    private static final int CONSTITUICAO_INICIAL = 20;
    private static final boolean IS_SOCIEDADE_DO_ANEL_INICIAL = false;

    public Goblim() {
        super(FORCA_INICIAL, AGILIDADE_INICIAL, INTELIGENCIA_INICIAL, CONSTITUICAO_INICIAL, IS_SOCIEDADE_DO_ANEL_INICIAL);
    }

    @Override
    public String grunir() {
        return "Iiisshhhh";
    }
    @Override
    public String toString() {
        return "M";
    }
}
