package simulador;

import classes.*;
import exception.PersonagemNaoEncontradoNoMapaException;
import exception.SauronDominaOMundoException;
import mapa.Mapa;
import personagens.Personagem;

public class Simulador {

    private Mapa mapa;

    public Simulador(Mapa mapa) {
        this.mapa = mapa;
    }

    private boolean existePersonagemSociedadeDoAnel() {
        for (int i = 0; i < mapa.getTamanho(); i++) {
            try {
                if (mapa.buscarCasa(i).isSociedadeDoAnel()){
                    return true;
                }
            } catch (PersonagemNaoEncontradoNoMapaException ignored) {
                // Não há personagem nesta posição.
            }
        }
        return false;
    }

    private boolean finalizarPartida() throws SauronDominaOMundoException {
        try {
            if (mapa.buscarCasa(mapa.getTamanho() - 1).isSociedadeDoAnel()) {
                return false;
            }
        } catch (PersonagemNaoEncontradoNoMapaException ignored) {
            // Não há personagem nesta posição.
        }

        if (!existePersonagemSociedadeDoAnel()) {
            throw new SauronDominaOMundoException();
        }
        return true;
    }

    private void lutar(Personagem personagem, int posicao) throws PersonagemNaoEncontradoNoMapaException {
        if (personagem instanceof Mago) {
            ((Mago) personagem).atacar(mapa, posicao, personagem.getInteligencia());
            ((Mago) personagem).movimentar(mapa, posicao);
        } else if (personagem instanceof Guerreiro) {
            ((Guerreiro) personagem).atacar(mapa, posicao, personagem.getForca());
            ((Guerreiro) personagem).movimentar(mapa, posicao);
        } else {
            ((Arqueiro) personagem).atacar(mapa, posicao, personagem.getAgilidade());
            ((Arqueiro) personagem).movimentar(mapa, posicao);
        }
    }

    public void simular() throws SauronDominaOMundoException {

        boolean isLutando = true;

        while (isLutando) {

            int ultimaPosicaoMovimentada = -1;
            for (int i = 0; i < mapa.getTamanho(); i++) {

                if (ultimaPosicaoMovimentada < i) {

                    try {

                        Personagem personagem = mapa.buscarCasa(i);

                        lutar(personagem, i);

                        ultimaPosicaoMovimentada = mapa.buscarPosicao(personagem);

                    } catch (PersonagemNaoEncontradoNoMapaException ignored) {
                        // Não há personagem nesta posição.
                    }
                }
            }

            isLutando = finalizarPartida();
        }
    }
}
