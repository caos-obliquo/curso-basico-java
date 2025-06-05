package com.loiane.cursojava.aula45;

public class Teste2 {
    public static void main(String[] args) {
        // Downcasting, só funciona se estiver referenciando aquele tipo em particular, como nos 2 exempos abaixo.
        Object obj1 = obterString();
        String s1 = (String) obj1;

        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        // Não está fazendo referência à nenhuma String, portanto irá causar erro em tempo de execução de código.
        Object obj3 = new Object();
        // String s3 = (String) obj3;

        // Exemplo com erro pois no method, dita 'int' e na função está como '(String)'.
        Object obj4 = obterInteiro();
        // String s4 = (String) obj4;
    }

    public static String obterString() {
        return "minha String";
    }

    public static int obterInteiro() {
        return 1;
    }
}
