package com.loiane.cursojava.aula52.labs;

public class AgendaCheiaException extends Exception {

    @Override
    public String toString() {
        return "Agenda está cheia! Máximo de 5 contatos permitidos";
    }
}
