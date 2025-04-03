package mapa;

import exception.PersonagemJaEstaNoMapaException;
import exception.PersonagemNaoEncontradoNoMapaException;
import exception.PosicaoOcupadaException;
import personagens.Personagem;

public class Mapa {

    private Personagem[] linhaDeBatalha;

    public Mapa() {
        this.linhaDeBatalha = new Personagem[10];
    }

    public int getTamanho() {
        return this.linhaDeBatalha.length;
    }

    public String exibir(){

        StringBuilder mapaMontado = new StringBuilder();
        mapaMontado.append("|");

        for(Personagem personagem: this.linhaDeBatalha) {
            if (personagem == null) {
                mapaMontado.append(" |");
            } else {
                mapaMontado.append(personagem.toString()).append("|");
            }
        }
        return mapaMontado.toString();
    }

    public void inserir(int posicao, Personagem personagem ) throws PosicaoOcupadaException, PersonagemJaEstaNoMapaException {
        if (this.linhaDeBatalha[posicao] != null) {
            throw new PosicaoOcupadaException();
        }
        for (Personagem personagemNoMapa : this.linhaDeBatalha) {
            if (personagemNoMapa != null && personagemNoMapa.equals(personagem)){
                throw new PersonagemJaEstaNoMapaException();
            }
        }
        this.linhaDeBatalha[posicao] = personagem;
    }

    public int buscarPosicao(Personagem personagem) throws PersonagemNaoEncontradoNoMapaException {
        for (int i = 0; i < linhaDeBatalha.length; i++) {
            if (linhaDeBatalha[i] != null && linhaDeBatalha[i].equals(personagem)){
                return i;
            }
        }
        throw new PersonagemNaoEncontradoNoMapaException();
    }

    public Personagem buscarCasa(int posicao) throws PersonagemNaoEncontradoNoMapaException {
        if ((posicao >= 0 && posicao < linhaDeBatalha.length) && this.linhaDeBatalha[posicao] != null){
            return this.linhaDeBatalha[posicao];
        }
        throw new PersonagemNaoEncontradoNoMapaException();
    }

    public boolean existeOutroPersonagem(int posicaoAtual) {
        for (int i = 0; i < this.linhaDeBatalha.length; i++) {
            if (this.linhaDeBatalha[i] != null && i != posicaoAtual) {
                return true;
            }
        }
        return false;
    }

    public boolean posicaoLivre(int posicao) {
        if (posicao >= 0 && posicao < linhaDeBatalha.length) {
            return this.linhaDeBatalha[posicao] == null;
        }
        return false;
    }

    public void moverPersonagem(int origem, int destino) {
        this.linhaDeBatalha[destino] = this.linhaDeBatalha[origem];
        this.linhaDeBatalha[origem] = null;
    }

    public void removerPersonagem(int posicao) {
        this.linhaDeBatalha[posicao] = null;
    }
}
