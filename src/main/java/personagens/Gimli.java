package personagens;

import classes.Guerreiro;
import racas.Anao;

public class Gimli extends Personagem implements Anao, Guerreiro {

    private static final int FORCA_INICIAL = 9;
    private static final int AGILIDADE_INICIAL = 2;
    private static final int INTELIGENCIA_INICIAL = 4;
    private static final int CONSTITUICAO_INICIAL = 60;
    private static final boolean IS_SOCIEDADE_DO_ANEL_INICIAL = true;
    private int quantidadeQueBebeu;

    public Gimli() {
        super(FORCA_INICIAL, AGILIDADE_INICIAL, INTELIGENCIA_INICIAL, CONSTITUICAO_INICIAL, IS_SOCIEDADE_DO_ANEL_INICIAL);
        this.quantidadeQueBebeu = 0;
    }

    @Override
    public void beber() {
        this.quantidadeQueBebeu += 1;
    }

    @Override
    public String falar() {
        if (quantidadeQueBebeu < 3) {
            return "Let them come. There is one Dwarf yet in Moria who still draws breath.";
        }
        return "What did I say? He can't hold his liquor!";
    }

    @Override
    public String toString() {
        return "I";
    }

}
