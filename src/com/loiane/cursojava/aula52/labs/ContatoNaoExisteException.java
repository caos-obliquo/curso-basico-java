package com.loiane.cursojava.aula52.labs;

public class ContatoNaoExisteException extends Exception {

    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String toString() {
        return "Contato " + nomeContato + " não existe na agenda!";
    }
}
