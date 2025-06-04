package com.loiane.cursojava.aula43.labs;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
        // (this.getRendaBruta() / 100) * 10
    }

    @Override
    public String toString() {
        String s = "Pessoa Jurídica[";
        s += super.toString();
        s += " ;cnpj: " + cnpj;
        s += " ;impostoASerPago: " + calcularImposto();
        s += "]";
        return s;
    }
}