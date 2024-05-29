package cliente; // Define que a classe Pessoa faz parte do pacote 'cliente'.

// Declaração da classe Pessoa
public class Pessoa {
    // Atributos privados da classe Pessoa
    private String nome; // Declara um atributo privado do tipo String chamado 'nome'.
    private String endereco; // Declara um atributo privado do tipo String chamado 'endereco'.
    private String email; // Declara um atributo privado do tipo String chamado 'email'.
    private String telefone; // Declara um atributo privado do tipo String chamado 'telefone'.

    // Método público para obter o nome
    public String getNome() {
        return nome; // Retorna o valor do atributo 'nome'.
    }

    // Método público para definir o nome
    public void setNome(String nome) {
        this.nome = nome; // Atribui o valor do parâmetro 'nome' ao atributo 'nome' da instância.
    }

    // Método público para obter o endereço
    public String getEndereco() {
        return endereco; // Retorna o valor do atributo 'endereco'.
    }

    // Método público para definir o endereço
    public void setEndereco(String endereco) {
        this.endereco = endereco; // Atribui o valor do parâmetro 'endereco' ao atributo 'endereco' da instância.
    }

    // Método público para obter o email
    public String getEmail() {
        return email; // Retorna o valor do atributo 'email'.
    }

    // Método público para definir o email
    public void setEmail(String email) {
        this.email = email; // Atribui o valor do parâmetro 'email' ao atributo 'email' da instância.
    }

    // Método público para obter o telefone
    public String getTelefone() {
        return telefone; // Retorna o valor do atributo 'telefone'.
    }

    // Método público para definir o telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone; // Atribui o valor do parâmetro 'telefone' ao atributo 'telefone' da instância.
    }
}
