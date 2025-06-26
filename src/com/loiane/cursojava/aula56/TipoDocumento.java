package com.loiane.cursojava.aula56;
/** Enum que representa tipos de documentos com capacidade de gerar números válidos.
 * Cada constante implementa o metodo abstrato 'geraNumeroTeste()' de forma especializada.
 * Segue o padrão Strategy para comportamentos distintos por tipo.
 *
 * Metodo abstrato que deve ser implementado por cada constante do enum.
 * @return Número de documento gerado aleatoriamente.
 */
public enum TipoDocumento {

    CPF {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cpf();
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cnpj();
        }
    };

    public abstract String geraNumeroTeste();
}
