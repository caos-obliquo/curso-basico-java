package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        /**
         * 04 - Faça um programa que verifique se uma letra digitada é vogal ou consoante.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra: ");
        String letra = scan.next();

//        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
//                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
//                letra.equalsIgnoreCase("u")){
//            System.out.println("vogal");
//        } else {
//            System.out.println("consoante.");
//        }

       switch (letra){
           case "a":
           case "e":
           case "i":
           case "o":
           case "u":
           case "A":
           case "E":
           case "I":
           case "O":
           case "U":System.out.println("vogal"); break;
           default: System.out.println("consoante");
       }
    }
}
