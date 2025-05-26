package com.loiane.cursojava.aula36;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Rick");
        // contato.setEndereco("Rua Universo");
        // contato.setTelefone("11 99999-9999");

        // relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Multiverso");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Seatle");
        end.setEstado("Washington, D.C.");
        end.setCep("9999999");

        contato.setEndereco(end);

        // relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("99");
        telefone.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("99");
        telefone2.setNumero("88888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        // contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        // teste saída no console
        System.out.println(contato.getNome());
        // System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        /* if (contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        } */

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
