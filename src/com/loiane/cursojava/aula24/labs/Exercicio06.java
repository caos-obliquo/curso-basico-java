package com.loiane.cursojava.aula24.labs;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        06 - Crie uma classe que represente um contato1 da agenda no seu celular.
        */

        Contato contato1 = new Contato();

        contato1.nome = "Randomaldo";
        contato1.endereco = "Rua 7 de Setembro, 1000";
        contato1.email = "randomaldo@email.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "(99) 99999-9999";
        contato1.telefones[1] = "(99) 99999-9998";
        contato1.telefones[2] = "(99) 99999-9997";
        contato1.telefones[3] = "(99) 99999-9996";
        contato1.telefones[4] = "(99) 99999-9995";

    }
}

