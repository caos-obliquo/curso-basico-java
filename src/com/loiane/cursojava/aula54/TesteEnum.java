package com.loiane.cursojava.aula54;

public class TesteEnum {
    // Classe de teste para demonstrar o uso de enums.
    // Enums estendem a classe 'java.lang.Enum'.
    // Podem ser comparados usando '==' ou 'equals()', sendo o 'equals()' mais eficiente.
    // Não podem ser instaciados com new.
    // Podem implementar interfaces.
    // Pode ser declarado separadamente ou dentro da classe.

    // Boas práticas: Use enums para representar conjuntos fixos de valores.
    // Prefira enums a constantes (int ou String) para mais segurança no código.
    public static void main(String[] args) {

        // Obtém uma constante do enum.
        DiaSemana dia = DiaSemana.DOMINGO;

        // Mostra o nome da constante e seu valor associado.
        System.out.println(dia.toString() + " - " + dia.getValor());

        // Uso de enum na classe 'Data'.
        Data data = new Data(26, 6, 2025, DiaSemana.QUINTA);
    }
}
