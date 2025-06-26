package com.loiane.cursojava.aula56;
/** Classe de teste para demonstrar o uso do enum 'TipoDocumento' com a classe 'Pessoa'.
 * Mostra como gerar números de documentos dinamicamente.
 * Ilustra conversão de String para enum com 'Enum.valueOf()'.
 */
public class TesteDocumento {
    public static void main(String[] args) {

        /*
        for (TipoDocumento doc : TipoDocumento.values()) {
            System.out.println(doc + " - " + doc.geraNumeroTeste());
        }
         */

        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
        System.out.println(pj);
    }
}
