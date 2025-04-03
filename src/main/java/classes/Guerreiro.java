package classes;

import exception.PersonagemNaoEncontradoNoMapaException;
import mapa.Mapa;
import personagens.Personagem;

public interface Guerreiro {

    default void atacar(Mapa mapa, int posicaoAtual, int forca) throws PersonagemNaoEncontradoNoMapaException {

        Personagem atacante = mapa.buscarCasa(posicaoAtual);
        boolean atacanteSociedadeDoAnel = atacante.isSociedadeDoAnel();

        int alvoPosicao = atacanteSociedadeDoAnel ? posicaoAtual + 1 : posicaoAtual - 1;

        try {
            Personagem alvo = mapa.buscarCasa(alvoPosicao);

            if (alvo.isSociedadeDoAnel() != atacanteSociedadeDoAnel) {
                alvo.setConstituicao(alvo.getConstituicao() - (forca * 2));

                if (alvo.getConstituicao() == 0) {
                    mapa.removerPersonagem(alvoPosicao);
                }
            }
        } catch (PersonagemNaoEncontradoNoMapaException ignored) {
            // Não há personagem nesta posição.
        }
    }
    default void movimentar(Mapa mapa, int posicaoAtual) throws PersonagemNaoEncontradoNoMapaException {

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
