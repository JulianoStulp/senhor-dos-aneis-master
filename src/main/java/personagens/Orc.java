package personagens;

import classes.Guerreiro;
import racas.Monstro;

public class Orc extends Personagem implements Monstro, Guerreiro {

    private static final int FORCA_INICIAL = 7;
    private static final int AGILIDADE_INICIAL = 4;
    private static final int INTELIGENCIA_INICIAL = 1;
    private static final int CONSTITUICAO_INICIAL = 30;
    private static final boolean IS_SOCIEDADE_DO_ANEL_INICIAL = false;

    public Orc() {
        super(FORCA_INICIAL, AGILIDADE_INICIAL, INTELIGENCIA_INICIAL, CONSTITUICAO_INICIAL, IS_SOCIEDADE_DO_ANEL_INICIAL);
    }

    @Override
    public String grunir() {
        return "Arrrggghhh";
    }
    @Override
    public String toString() {
        return "O";
    }

}
