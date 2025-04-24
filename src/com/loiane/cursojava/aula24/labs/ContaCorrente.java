package com.loiane.cursojava.aula24.labs;

import java.time.LocalDate;

public class ContaCorrente {
    /*
    05 - Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se
    ela é especial ou não, um limite.
     */

    String titular;
    String tipoConta;
    LocalDate aberturaConta = LocalDate.now();
    int saldo;
    boolean especial;
    double limite = 1500;
}
