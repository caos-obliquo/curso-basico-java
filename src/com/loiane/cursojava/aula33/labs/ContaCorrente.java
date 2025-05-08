package com.loiane.cursojava.aula33.labs;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double valorEspecialUsado;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial,
                         double valorEspecialUsado, double saldo) {
        this.setNumero(numero);
        this.setAgencia(agencia);
        this.setEspecial(especial);
        this.setLimiteEspecial(limiteEspecial);
        this.setValorEspecialUsado(valorEspecialUsado);
        this.setSaldo(saldo);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean realizarSaque(double quantiaASacar) {

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
                return false;
            }
        }
    }

    public void depositar(double valorDepostidado) {
        saldo += valorDepostidado;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);

    }

    public boolean verificarUsoChequeEspecial() {
        return saldo < 0;

    }
}