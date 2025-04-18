package com.loiane.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {

//        double temperaturaDia001 = 31.3;
//        double temperaturaDia002 = 32;
//        double temperaturaDia003 = 33.7;
//        double temperaturaDia004 = 34;
//        double temperaturaDia005 = 35;
//        ...
//        double temperaturaDia365 = 33.3;

//        má prática
//        double temperaturas[] = new double[365];

//        boa prática
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
//        o valor padrão de um array é sempre zero

        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

        System.out.println("O tamanho do array: " + temperaturas.length);

//        endereço de memória em que o array está apontando
        System.out.println("Valores do array: " + temperaturas);

//        para ter a inforamação do índice e do contador
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
        }

//        para ter a informação apenas do valor
        for (double temp : temperaturas) {
            System.out.println(temp);
        }
    }
}
