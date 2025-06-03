package com.loiane.cursojava.aula43.labs;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        01 - Elabore uma classe ContaBancaria com os seguintes atributos:

        * nomeCliente;
        * numConta;
        * saldo;

        E com os seguintes métodos:

        * sacar (o saldo não pode ficar negativo);
        * depositar;

        Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial com as seguintes características:

        ContaPoupanca
        * atributo diaRendimento;
        * method calcularNovoSaldo recebe taxa de rendimento da poupança e atualiza o saldo;

        ContaEspecial
        * atributo limite;
        * sobrescreva o method sacar com a nova lógica necessária;

        Crie uma classe Teste que contenha a seguinte lógica:

        * Criar contas;
        * Sacar um valor das contas;
        * Depositar;
        * Mostrar um novo saldo a partir do rendimento;
        * Mostrar os dados das contas do cliente.
         */

        System.out.println("*** Teste ContaBancaria *** ");

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNomeCliente("Cliente Conta Simples");
        contaBancaria.setNumConta("1111");

        contaBancaria.depositar(100);

        realizarSaque(contaBancaria, 50);

        realizarSaque(contaBancaria, 70);

        System.out.println(contaBancaria);

        System.out.println("*** Teste ContaPoupanca *** ");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupanca");
        contaPoupanca.setNumConta("2222");
        contaPoupanca.setDiaRendimento(6);

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);

        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, o novo saldo é de: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }

        System.out.println(contaPoupanca);

        System.out.println("*** Teste ContaEspecial *** ");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("3333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de " + conta.getSaldo());
        }
    }
}




