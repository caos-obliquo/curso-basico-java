package com.loiane.cursojava.aula44;

public abstract class Animal {
    // Interfaces são fundamentais para criar código flexível, extensível e de baixo acoplamento.
    // Interfaces não podem ter instâncias, apenas constantes.
    // Uma classe pode conceber múltiplas interfaces, porém estender apenas uma classe.
    // Útil quando precisa-se definir um certo comportamento comum para classes não relacionadas.
    // Útil quando precisa-se especificar um contrato sem se preocupar com a implementação necessária.
    private String nome;

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
