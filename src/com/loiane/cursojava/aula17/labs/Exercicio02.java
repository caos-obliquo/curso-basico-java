package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        02 - Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
        mostrando uma mensagem de erro e voltando a pedir informações.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um nome de usuário: ");
        String nomeUsuario = scan.next();

        System.out.println("Entre com uma senha diferente do nome de usuario: ");
        String senha = scan.next();

        boolean senhaIgualUsuario = nomeUsuario.equals(senha);

        while(senhaIgualUsuario) {
            System.out.println("Senha igual a usuario. Entre com uma nova senha");
            senha = scan.next();

            senhaIgualUsuario = nomeUsuario.equals(senha);
        }

//        String out = "Usuario: " + nomeUsuario + ", Senha: " + senha;
        System.out.println(String.format("Usuario: %s, Senha: %s", nomeUsuario, senha));
    }
}
