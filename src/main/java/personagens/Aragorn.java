package personagens;

import classes.Guerreiro;
import racas.Humano;

public class Aragorn extends Personagem implements Humano, Guerreiro {

    private static final int FORCA_INICIAL = 10;
    private static final int AGILIDADE_INICIAL = 7;
    private static final int INTELIGENCIA_INICIAL = 6;
    private static final int CONSTITUICAO_INICIAL = 60;
    private static final boolean IS_SOCIEDADE_DO_ANEL_INICIAL = true;
    private static final int QUANTIDADE_CONSTITUICAO_ENVELHECER = 1;

    public Aragorn() {
        super(FORCA_INICIAL, AGILIDADE_INICIAL, INTELIGENCIA_INICIAL, CONSTITUICAO_INICIAL, IS_SOCIEDADE_DO_ANEL_INICIAL);
    }

    @Override
    public String falar() {
        return "A day may come when the courage of men fails… but it is not THIS day.";
    }

    @Override
    public void envelhecer() {
        if (this.constituicao > 0){
            this.constituicao -= QUANTIDADE_CONSTITUICAO_ENVELHECER;
        }
    }
    @Override
    public String toString() {
        return "A";
    }

}
