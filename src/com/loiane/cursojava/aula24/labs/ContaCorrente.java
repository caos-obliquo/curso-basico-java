package com.loiane.cursojava.aula24.labs;

import java.time.LocalDate;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    String titular;
    String tipoConta;
    LocalDate aberturaConta = LocalDate.now();
    int saldo;
    double limite = 1500;
}
