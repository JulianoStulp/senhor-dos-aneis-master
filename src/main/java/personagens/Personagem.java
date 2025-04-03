package personagens;

public abstract class Personagem {

    protected int forca;
    protected int agilidade;
    protected int inteligencia;
    protected int constituicao;
    protected boolean isSociedadeDoAnel;

    protected Personagem(int forca, int agilidade, int inteligencia, int constituicao, boolean isSociedadeDoAnel) {
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.constituicao = constituicao;
        this.isSociedadeDoAnel = isSociedadeDoAnel;
    }

    public int getForca() {
        return forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public boolean isSociedadeDoAnel() {
        return isSociedadeDoAnel;
    }

    public void setConstituicao(int constituicao) {
        if (constituicao < 0){
            constituicao = 0;
        }
        this.constituicao = constituicao;
    }

}
