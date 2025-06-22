package com.loiane.cursojava.aula52.labs;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
    /*
     1 - Escreva  uma  classe  Contato  que  contenha  nome,  telefone  e  um   identificador.  Esse  identificador
     deve  ser  gerado  automaticamente  pela   classe  através  de  um  contador  (cada  vez  que  um  Contato  é
     criado  o   contador  é  incrementado  e  atribuído  ao  identificador).  Crie  uma  classe   Agenda  que  irá
     funcionar  para  gerenciar  os  Contatos.  Essa  classe  precisa   de  ter  um  method  para  adicionar  um
     Contato  e  também  para  consultar.   Crie  uma  classe  Teste  que  informe  um  menu  ao  usuário:
     a) para  consultar   um  contato  da  agenda  e
     b) para  adicionar  um  contato  na  agenda.

     Se  o  contato  não existir,  o  programa  deve  lançar  uma  exceção  de   ContatoNaoExisteException.  Caso  a
     agenda  esteja  cheia quando  o  usuário   quiser  adicionar  um  novo  contato,  o  programa  deve  lançar  uma
     exceção AgendaCheiaExeption.  Trate  também  as  exceções  de  tipo  de  dados  (caso  o   usuário  entre  com  um
     tipo de  dado  inválido.
     */

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 0;

        do {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                case 1:
                    consultarContato(scan, agenda);
                    break;
                case 2:
                    adicionarContato(scan, agenda);
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! (Digite 1, 2 ou 3)");
            }
        } while (opcao != 3);
        scan.close();
    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = lerInformacaoString(scan, "Entre com o nome do contato a ser pesquisado");
        try {
            Contato contato = agenda.consultarContatoPorNome(nomeContato);
            System.out.println("Contato encontrado:");
            System.out.println(contato);
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        System.out.println("Criando um contato, entre com as informações");
        String nome = lerInformacaoString(scan, "Entre com o nome do contato");
        String telefone = lerInformacaoString(scan, "Entre com o telefone do contato");
        String email = lerInformacaoString(scan, "Entre com o email do contato");

        Contato contato = new Contato(nome, telefone, email);

        System.out.println("Contado a ser criado: ");
        System.out.println(contato);

        try {
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
    }

    public static String lerInformacaoString(Scanner scan, String msg) {
        System.out.println(msg);
        return scan.nextLine();
    }

    public static int obterOpcaoMenu(Scanner scan) {

        int opcao = 0;
        boolean entradaValida = false;

        while (!entradaValida) {

            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Consultar contato");
            System.out.println("2 - Adicionar contato");
            System.out.println("3 - Sair");

            try {
                opcao = Integer.parseInt(scan.nextLine());
                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                    return opcao;
                }
                System.out.println("Opção inválida! Digite 1, 2 ou 3");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número.");
            }
        }

        return opcao;
    }
}
