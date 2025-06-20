package com.loiane.cursojava.aula43.labs;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        super();
        this.setCor("Castanho");
        this.setAmbiente("Terra");
        this.setAlimento("Mel");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + alimento;
        return s;
    }
}
