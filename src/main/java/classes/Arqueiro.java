package classes;

import exception.PersonagemNaoEncontradoNoMapaException;
import mapa.Mapa;
import personagens.Personagem;

public interface Arqueiro {

    default void atacar(Mapa mapa, int posicaoAtual, int agilidade) throws PersonagemNaoEncontradoNoMapaException {

        Personagem atacante = mapa.buscarCasa(posicaoAtual);
        boolean atacanteSociedadeDoAnel = atacante.isSociedadeDoAnel();

        for (int distancia = 3; distancia >= 1; distancia--) {

            int alvoPosicao = atacanteSociedadeDoAnel ? posicaoAtual + distancia : posicaoAtual - distancia;

            try {
                Personagem alvo = mapa.buscarCasa(alvoPosicao);

                if (alvo.isSociedadeDoAnel() != atacanteSociedadeDoAnel) {
                    alvo.setConstituicao(alvo.getConstituicao() - (agilidade * distancia));

                    if (alvo.getConstituicao() == 0) {
                        mapa.removerPersonagem(alvoPosicao);
                    }
                    break;
                }
            } catch (PersonagemNaoEncontradoNoMapaException ignored) {
                // Não há personagem nesta posição.
            }
        }
    }

    default void movimentar(Mapa mapa, int posicaoAtual) throws PersonagemNaoEncontradoNoMapaException {

        Personagem personagem = mapa.buscarCasa(posicaoAtual);

        if (personagem.isSociedadeDoAnel()) { // Movimentação de personagem que são da sociedade do anel
            if (mapa.posicaoLivre(posicaoAtual + 2) && mapa.posicaoLivre(posicaoAtual + 1)) {
                mapa.moverPersonagem(posicaoAtual, posicaoAtual + 2);
            } else if (mapa.posicaoLivre(posicaoAtual + 1)) {
                mapa.moverPersonagem(posicaoAtual, posicaoAtual + 1);
            }
        } else { // Movimentação de personagem que não são da sociedade do anel
            if (mapa.posicaoLivre(posicaoAtual - 2) && mapa.posicaoLivre(posicaoAtual - 1)) {
                mapa.moverPersonagem(posicaoAtual, posicaoAtual - 2);
            } else if (mapa.posicaoLivre(posicaoAtual - 1)) {
                mapa.moverPersonagem(posicaoAtual, posicaoAtual - 1);
            }
        }
    }
}
