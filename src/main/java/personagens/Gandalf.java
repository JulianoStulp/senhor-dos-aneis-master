package personagens;

import classes.Mago;
import racas.Maia;

public class Gandalf extends Personagem implements Maia, Mago {

    private static final int FORCA_INICIAL = 2;
    private static final int AGILIDADE_INICIAL = 3;
    private static final int INTELIGENCIA_INICIAL = 10;
    private static final int CONSTITUICAO_INICIAL = 80;
    private static final boolean IS_SOCIEDADE_DO_ANEL_INICIAL = true;

    public Gandalf() {
        super(FORCA_INICIAL, AGILIDADE_INICIAL, INTELIGENCIA_INICIAL, CONSTITUICAO_INICIAL, IS_SOCIEDADE_DO_ANEL_INICIAL);
    }

    @Override
    public Gandalf ressucitar() {
        if (this.constituicao == 0) {
            return new Gandalf();
        }
        return null;
    }

    @Override
    public String falar() {
        return "A Wizard is never late, nor is he early. He arrives precisely when he means to.";
    }

    @Override
    public String toString() {
        return "G";
    }

}
