package com.loiane.cursojava.aula46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL{

    // Comparativo de interface e herança.

    void abrirConexao();
    void fecharConexao();
}