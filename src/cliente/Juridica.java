package cliente; // Define que a classe Juridica faz parte do pacote 'cliente'.

// Declaração da classe Juridica, que herda de Pessoa
public class Juridica extends Pessoa {
    private String cnpj; // Declara um atributo privado do tipo String chamado 'cnpj'.

    // Método público para obter o CNPJ
    public String getCnpj() {
        return cnpj; // Retorna o valor do atributo 'cnpj'.
    }

    // Método público para definir o CNPJ
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj; // Atribui o valor do parâmetro 'cnpj' ao atributo 'cnpj' da instância.
    }
    
    // Sobrescrita do método toString para representar a Pessoa Jurídica como uma String
    @Override
    public String toString() {
        return "Pessoa Juridica:\n"
                + "Nome: " + getNome() // Obtém o nome da pessoa jurídica
                + "\nEndereço: " + getEndereco() // Obtém o endereço da pessoa jurídica
                + "\nE-mail: " + getEmail() // Obtém o e-mail da pessoa jurídica
                + "\nTelefone: " + getTelefone() // Obtém o telefone da pessoa jurídica
                + "\nCNPJ: " + cnpj; // Obtém o CNPJ da pessoa jurídica
    }
}
