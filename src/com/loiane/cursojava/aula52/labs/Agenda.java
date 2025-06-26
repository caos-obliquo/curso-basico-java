package com.loiane.cursojava.aula52.labs;

public class Agenda {

    private Contato[] contatos;
    private int tamanho;

    public Agenda() {
        contatos = new Contato[5];
        tamanho = 0;
    }

    public void adicionarContato(Contato contato) throws AgendaCheiaException {
        if (tamanho >= contatos.length) {
            throw new AgendaCheiaException();
        }
        contatos[tamanho++] = contato;
    }

    public Contato consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
        Contato contato = null;
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                contato = contatos[i];
            }
        }
        if (contato == null) {
            throw new ContatoNaoExisteException(nome);
        }

        return contato;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {  // Alterado para usar 'tamanho' em vez do array completo
            if (contatos[i] != null) {       // Verificação de null adicionada
                s.append(contatos[i].toString()).append("\n");
            }
        }
        return s.toString();
    }
}

