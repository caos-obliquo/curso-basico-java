package com.loiane.cursojava.aula43.labs;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        03 - Um animal contém nome, comprimento, número de patas (padrão: 4), cor, ambiente e velocidade (em m/s). Um
        peixe é um animal, tem 0 patas, seu ambiente é o mar (padrão), cor cinzenta (padrão). Além disso tem como
        característica as barbatanas e a cauda. Um mamífero, cor castanho, e seu alimento preferido é o mel. Crie as
        classes Animal, Peixe e Mamífero. Para a classe Animal, coloque os atributos: Nome, comprimento, patas, cor,
        ambiente e velocidade. Para a classe Peixe, codifique os atributos característicos. Para a classe Mamífero,
        coloque o atributo alimento. Por último, crie uma classe Teste de forma a ter um jardim zoológico com os
        seguintes animais: camelo, tubarão, urso-do-canadá. Exemplo de execução:

        Zoo:

        Animal: Camelo
        Comprimento: 150 cm
        Patas: 4
        Cor: Amarelo
        Ambiente: Terra
        Velocidade: 2.0 m/s

        Animal: Tubarão
        Comprimento: 300 cm
        Patas: 0
        Cor: Cinzento
        Ambiente: Mar
        Velocidade: 1.5 m/s
        Característica: Barbatanas e cauda.

        Animal: Urso-do-candá
        Comprimento: 180 cm
        Patas: 4
        Cor: Vermelho
        Ambiente: Terra
        Velocidade: 0.5 m/s
        Alimento: Mel
         */

        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("-------------------");
        for (Animal animal : animais) {
            System.out.println(animal.toString());
            System.out.println("-------------------");
        }
    }
}
