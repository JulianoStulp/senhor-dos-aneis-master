package classes;

import exception.PersonagemNaoEncontradoNoMapaException;
import mapa.Mapa;
import personagens.Personagem;

public interface Mago {

    default void atacar(Mapa mapa, int posicaoAtual, int inteligencia) throws PersonagemNaoEncontradoNoMapaException {

        Personagem atacante = mapa.buscarCasa(posicaoAtual);
        boolean atacanteSociedadeDoAnel = atacante.isSociedadeDoAnel();

        for (int i = 0; i < mapa.getTamanho(); i++) {

            try {
                Personagem alvo = mapa.buscarCasa(i);

                if (alvo.isSociedadeDoAnel() != atacanteSociedadeDoAnel) {
                    alvo.setConstituicao(alvo.getConstituicao() - inteligencia);

                    if (alvo.getConstituicao() == 0) {
                        mapa.removerPersonagem(i);
                    }
                }
           } catch (PersonagemNaoEncontradoNoMapaException ignored) {
                // Não há personagem nesta posição.
           }
        }
    }

    default void movimentar(Mapa mapa, int posicaoAtual) throws PersonagemNaoEncontradoNoMapaException {

        if (!mapa.existeOutroPersonagem(posicaoAtual)) {

            Personagem personagem = mapa.buscarCasa(posicaoAtual);

            if (personagem.isSociedadeDoAnel()) { // Movimentação de personagem que são da sociedade do anel
                if (mapa.posicaoLivre(posicaoAtual + 1)) {
                    mapa.moverPersonagem(posicaoAtual, posicaoAtual + 1);
                }
            } else { // Movimentação de personagem que não são da sociedade do anel
                if (mapa.posicaoLivre(posicaoAtual - 1)) {
                    mapa.moverPersonagem(posicaoAtual, posicaoAtual - 1);
                }
            }
        }
    }
}
