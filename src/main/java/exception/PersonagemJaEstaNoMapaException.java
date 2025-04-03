package exception;

public class PersonagemJaEstaNoMapaException extends Exception {
    public PersonagemJaEstaNoMapaException() {
        super("O personagem já está posicionado no mapa.");
    }
}
