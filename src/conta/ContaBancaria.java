package conta; // Define que a classe ContaBancaria faz parte do pacote 'conta'.

import cliente.Pessoa; // Importa a classe Pessoa do pacote 'cliente'.

// Declaração da classe ContaBancaria
public class ContaBancaria {
    // Atributos privados da classe ContaBancaria
    private String agencia; // Declara um atributo privado do tipo String chamado 'agencia'.
    private String nroConta; // Declara um atributo privado do tipo String chamado 'nroConta'.
    private String senha; // Declara um atributo privado do tipo String chamado 'senha'.
    private float saldo; // Declara um atributo privado do tipo float chamado 'saldo'.
    private Pessoa pessoa; // Declara um atributo privado do tipo Pessoa chamado 'pessoa'.

    // Método público para obter o valor da agência
    public String getAgencia() {
        return agencia; // Retorna o valor do atributo 'agencia'.
    }

    // Método público para definir o valor da agência
    public void setAgencia(String agencia) {
        this.agencia = agencia; // Atribui o valor do parâmetro 'agencia' ao atributo 'agencia' da instância.
    }

    // Método público para obter o número da conta
    public String getNroConta() {
        return nroConta; // Retorna o valor do atributo 'nroConta'.
    }

    // Método público para definir o número da conta
    public void setNroConta(String nroConta) {
        this.nroConta = nroConta; // Atribui o valor do parâmetro 'nroConta' ao atributo 'nroConta' da instância.
    }

    // Método público para obter a senha
    public String getSenha() {
        return senha; // Retorna o valor do atributo 'senha'.
    }

    // Método público para definir a senha
    public void setSenha(String senha) {
        this.senha = senha; // Atribui o valor do parâmetro 'senha' ao atributo 'senha' da instância.
    }

    // Método público para obter o saldo
    public float getSaldo() {
        return saldo; // Retorna o valor do atributo 'saldo'.
    }

    // Método público para definir o saldo
    public void setSaldo(float saldo) {
        this.saldo = saldo; // Atribui o valor do parâmetro 'saldo' ao atributo 'saldo' da instância.
    }

    // Método público para obter a pessoa associada à conta
    public Pessoa getPessoa() {
        return pessoa; // Retorna o valor do atributo 'pessoa'.
    }

    // Método público para definir a pessoa associada à conta
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa; // Atribui o valor do parâmetro 'pessoa' ao atributo 'pessoa' da instância.
    }
}
