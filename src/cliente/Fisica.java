package cliente; // Define que a classe Fisica faz parte do pacote 'cliente'.

// Declaração da classe Fisica, que herda de Pessoa
public class Fisica extends Pessoa {
    private String cpf; // Declara um atributo privado do tipo String chamado 'cpf'.

    // Método público para obter o CPF
    public String getCpf() {
        return cpf; // Retorna o valor do atributo 'cpf'.
    }

    // Método público para definir o CPF
    public void setCpf(String cpf) {
        this.cpf = cpf; // Atribui o valor do parâmetro 'cpf' ao atributo 'cpf' da instância.
    }

    // Sobrescrita do método toString para representar a Pessoa Física como uma String
    @Override
    public String toString() {
        return "Pessoa Fisica:\n"
                + "Nome: " + getNome() // Obtém o nome da pessoa física
                + "\nEndereço: " + getEndereco() // Obtém o endereço da pessoa física
                + "\nE-mail: " + getEmail() // Obtém o e-mail da pessoa física
                + "\nTelefone: " + getTelefone() // Obtém o telefone da pessoa física
                + "\nCPF: " + cpf; // Obtém o CPF da pessoa física
    }
}
