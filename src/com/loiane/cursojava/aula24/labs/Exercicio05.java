package com.loiane.cursojava.aula24.labs;

import java.time.LocalDate;

public class Exercicio05 {
    /*
    05 - Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se
    ela é especial ou não, um limite.
     */
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numero = "123456";
        conta.agencia = "1234";
        conta.titular = "Randomaldo";
        conta.tipoConta = "Poupança";
        conta.aberturaConta = LocalDate.of(2025, 4, 24);
        conta.saldo = 10000;
        conta.especial = true;
        conta.limite = 1500;
    }
}
