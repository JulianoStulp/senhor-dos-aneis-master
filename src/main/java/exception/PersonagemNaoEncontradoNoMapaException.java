package exception;

public class PersonagemNaoEncontradoNoMapaException extends Exception {
    public PersonagemNaoEncontradoNoMapaException() {
        super("O personagem não existe no mapa.");
    }
}
