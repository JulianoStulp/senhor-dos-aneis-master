package exception;

public class PosicaoOcupadaException extends Exception {
    public PosicaoOcupadaException() {
        super("Já existe um personagem ocupando essa posição.");
    }
}
