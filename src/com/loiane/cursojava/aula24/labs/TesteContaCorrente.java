package com.loiane.cursojava.aula24.labs;

import java.time.LocalDate;

public class TesteContaCorrente {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.titular = "Randomaldo";
        conta.tipoConta = "Poupança";
        conta.aberturaConta = LocalDate.of(2025, 4, 24);
        conta.saldo = 10000;
        conta.especial = true;
        conta.limite = 1500;
    }
}
