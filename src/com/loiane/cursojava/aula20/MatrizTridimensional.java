package com.loiane.cursojava.aula20;

public class MatrizTridimensional {
    public static void main(String[] args) {
        /*
        Faça um programa que crie uma matriz 3x3x3 onde cada elemento da matriz seja igual a somar dos seus índices
        (exemplo: M[1, 2, 1] = 1 + 2 + 1 = 4).
        Obtenha a somar de todos os elementos da matriz, e obtenha a somar dos elementos cujos valores são pares e a somar
        dos elementos cujos valores são ímpares. Exibir na tela os valores da somar total, somar dos pares e somar dos
        ímpares.
        */

        int [][][] matrizTridimensional = new int[3][3][3];

        for (int i = 0; i < matrizTridimensional.length; i++) {
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < matrizTridimensional.length; i++) {
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    System.out.println("i = " + i + " - j = " + j + " - k = " + k);
                    soma += matrizTridimensional[i][j][k];

                    if (matrizTridimensional[i][j][k] % 2 == 0) {
                        somaPares += matrizTridimensional[i][j][k];
                    } else {
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma total: " + soma);
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);
    }
}
