package com.loiane.cursojava.aula43.labs;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "ContaPoupanca[";
        s += " diaRendimento: " + diaRendimento;
        s += "; " + super.toString();
        s += "]";
        return s;
    }

    public boolean calcularNovoSaldo(double taxaRendimeto) {

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            // saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimeto));
            return true;
        }
        return false;
    }
}
