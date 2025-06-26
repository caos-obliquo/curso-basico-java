package com.loiane.cursojava.aula56;
/**
 * Representa uma pessoa com tipo e número de documento.
 * Demonstra composição com enum 'TipoDocumento'.
 * Inclui métodos de acesso (getters/setters) e representação em String.
 */
public class Pessoa {

    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

    public Pessoa() {
    }

    public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    //Representação textual do objeto (útil para logs/debug).
    // * @return String no formato: Pessoa{tipoDocumento=CPF, numeroDocumento='123.456.789-00'}
    @Override
    public String toString() {
        return "Pessoa{" +
                "tipoDocumento=" + tipoDocumento +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                '}';
    }
}
