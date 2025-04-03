package personagens;

import classes.Guerreiro;
import racas.Humano;

public class Boromir extends Personagem implements Humano, Guerreiro {

    private static final int FORCA_INICIAL = 7;
    private static final int AGILIDADE_INICIAL = 6;
    private static final int INTELIGENCIA_INICIAL = 3;
    private static final int CONSTITUICAO_INICIAL = 40;
    private static final boolean IS_SOCIEDADE_DO_ANEL_INICIAL = true;
    private static final int QUANTIDADE_CONSTITUICAO_ENVELHECER = 2;

    public Boromir() {
        super(FORCA_INICIAL, AGILIDADE_INICIAL, INTELIGENCIA_INICIAL, CONSTITUICAO_INICIAL, IS_SOCIEDADE_DO_ANEL_INICIAL);
    }

    @Override
    public void envelhecer() {
        if (this.constituicao > 0){
            this.constituicao -= QUANTIDADE_CONSTITUICAO_ENVELHECER;
        }
    }

    @Override
    public String falar() {
        return "One does not simply walk into Mordor.";
    }

    @Override
    public String toString() {
        return "B";
    }
}
