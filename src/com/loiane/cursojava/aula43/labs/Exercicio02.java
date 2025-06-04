package com.loiane.cursojava.aula43.labs;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        02 - A Receita Federal possui um cadastro dos contribuintes. Cada contribuinte possui o nome. Escreva um
        programa para calcular o imposto a ser pago para 6 contribuintes. Os contribuintes podem ser: Pessoa Jurídica.
        O imposto corresponde a 10% da renda bruta da empresa.

        Pessoa Física:
        Renda Bruta              Alíquota            Parcela a deduzir
        0 a 1400                 0%                  R$ 0
        1400,01 a 2100           10%                 R$ 100
        2100,01 a 2800           15%                 R$ 270
        2800,01 a 3600           25%                 R$ 500
        3600,01 ou mais          30%                 R$ 700

        Escreva um programa para calcular, imprimir na tela o imposto a ser pago de 6 contribuintes, sendo 3 PJ e 3 PF.
        */

        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte01");
        p1.setRendaBruta(1000);
        p1.setCpf("021.182.940-42");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte02");
        p2.setRendaBruta(5000);
        p2.setCnpj("23.075.164/0001-83");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte03");
        p3.setRendaBruta(2000);
        p3.setCpf("518.158.150-19");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte04");
        p4.setRendaBruta(3000);
        p4.setCnpj("18.232.634/0001-35");

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Contribuinte05");
        p5.setRendaBruta(3700);
        p5.setCpf("913.548.560-40");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte06");
        p6.setRendaBruta(4000);
        p6.setCnpj("00.780.825/0001-76");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for (Contribuinte c : contribuintes) {
            System.out.println(c.toString());
        }
    }
}
