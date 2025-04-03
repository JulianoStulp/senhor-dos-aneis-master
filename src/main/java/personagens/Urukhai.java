package personagens;

import classes.Guerreiro;
import racas.Humano;
import racas.Monstro;

public class Urukhai extends Personagem implements Monstro, Humano, Guerreiro {

    private static final int FORCA_INICIAL = 8;
    private static final int AGILIDADE_INICIAL = 6;
    private static final int INTELIGENCIA_INICIAL = 3;
    private static final int CONSTITUICAO_INICIAL = 45;
    private static final boolean IS_SOCIEDADE_DO_ANEL_INICIAL = false;
    private static final int QUANTIDADE_CONSTITUICAO_ENVELHECER = 2;

    public Urukhai() {
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
        return "Looks like meat's back on the menu boys!";
    }

    @Override
    public String grunir() {
        return "Uuurrrrrr";
    }

    @Override
    public String toString() {
        return "U";
    }
}
