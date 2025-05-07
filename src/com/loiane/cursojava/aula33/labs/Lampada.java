package com.loiane.cursojava.aula33.labs;

public class Lampada {
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private String[] tipos;
    private int garantiaMeses;
    private boolean tipoAbajur;
    boolean ligada;

    public Lampada() {
    }

    // Alt + Insert: generate constructor
    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, String[] tipos,
                   int garantiaMeses, boolean tipoAbajur) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.tipos = tipos;
        this.garantiaMeses = garantiaMeses;
        this.tipoAbajur = tipoAbajur;
        this.ligada = false;
    }

    // refactor: encapsule fields...
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;

    }

    // métodos específicos para o estado 'ligada'
    public boolean isLigada() {
        return ligada;
    }

    public void setLigada() {
        this.ligada = ligada;
    }

    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    void mostrarEstado() {
        if (isLigada()) {
            System.out.println("Lâmpada está ligada.");
        } else {
            System.out.println("Lâmpada está desligada.");
        }
    }

    void mudarEstado() {
        if (isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }
}
