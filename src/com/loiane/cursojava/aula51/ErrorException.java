package com.loiane.cursojava.aula51;

public class ErrorException {
    // Aula teórica onde aprendemos a diferença entre erros e exceções.

    // Hierarquia de classes IMPORTANTE:
    // Throwable (classe pai)
    // ├── Error (problemas graves)
    // └── Exception (situações excepcionais)
    //      └── RuntimeException (exceções não verificadas)

    // Principais diferenças:
    // 1 - ERROS (Error):
    // Exceções checked e unchecked.
    // - Representam problemas graves que geralmente estão fora do controle do programa.
    // - Normalmente resultam na finalização da JVM (não devem ser capturados/tratados).
    // - Exemplos comuns:
    //                   OutOfMemoryError: quando a JVM fica sem memória.
    //                   StackOverflowError: quando a pilha de chamadas transborda.
    //                   VirtualMachineError: problemas na JVM.

    // 2 - EXCEÇÕES (Exceptions):
    // - Representam situações anormais que podem ser tratadas pelo programa.
    // - Podem ser recuperadas para continuar a execução.
    // - Dividem-se em dois tipos:
    //                            a) CHECKED EXCEPTIONS (verificadas):
    //                            - O compilador obriga a tratar ou declarar (com throws).
    //                            - Herdam de Exception mas não de RuntimeException.
    // - Exemplos comuns:
    //                   IOException: problemas de I/O (arquivos, streams).
    //                   SQLException: problemas com banco de dados.
    //                   FileNotFoundException: arquivo não encontrado.
    //
    //                            b) UNCHECKED EXCEPTIONS (não verificadas):
    //                            - O compilador não obriga o tratamento.
    //                            - Herdam de RuntimeException.
    // - Exemplos comuns:
    //                   NullPointerException: tentativa de usar referência nula.
    //                   ArrayIndexOutOfBoundsException: índice inválido em array.
    //                   ArithmeticException: erro aritmético (divisão por zero).
    //                   ClassCastException: conversão inválida de tipos.
    //                   0IllegalArgumentException: argumento inválido para métodos.

    // * BOAS PRÁTICAS:
    //
    // Os próprios nomes dos erros dos códigos indicam do que se trata o erro.
    // Ler em inglês é fundamental para o programador.
    //
    //     * 1. Para Errors: não tente capturar (deixe a JVM finalizar).
    //     * 2. Para Checked Exceptions: sempre trate ou declare com throws.
    //     * 3. Para Unchecked Exceptions: trate apenas quando fizer sentido.
    //     * 4. Documente sempre as exceções que seus métodos podem lançar.
    //
    //     * Métodos que podem lançar diferentes tipos de exceções.
    //     * @param value valor de entrada.
    //     * @throws IllegalArgumentException se o valor for negativo (unchecked)
    //     * @throws IOException se ocorrer erro de I/O (checked)
}
