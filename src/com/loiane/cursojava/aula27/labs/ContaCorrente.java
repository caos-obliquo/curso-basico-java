package com.loiane.cursojava.aula27.labs;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar) {

        // tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else { // não tem saldo na conta
            if (especial) {
                // verifica se o limite epecial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; // não é especial e não tem saldo suficiente
            }
        }
    }

    void depositar(double valorDepostidado) {

        saldo += valorDepostidado;
    }

    void consultarSaldo() {

        System.out.println("Saldo atual da conta = " + saldo);

    }

    boolean verificarUsoChequeEspecial() {

        return saldo < 0;

    }
}

