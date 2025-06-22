package com.loiane.cursojava.aula52.labs;

public class Contato {

    private static int contador = 0;

    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
        contador++;
        this.id = contador;
    }

    public Contato(String nome, String telefone, String email) {
        this();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[Id: " + id +
                ", Nome: " + nome +
                ", Telefone: " + telefone +
                ", Email: " + email + "]";
    }
}
