package conta; //Define que a classe Poupanca faz parte do pacote conta.

// Declaração da classe Poupanca que herda de ContaBancaria
public class Poupanca extends ContaBancaria { //Declara a classe Poupanca como uma subclasse de ContaBancaria.
    // Atributo privado taxa
    private float taxa; // Declara um atributo privado taxa do tipo float.

    // Construtor da classe Poupanca
    public Poupanca() { //Construtor da classe Poupanca que inicializa a taxa com o valor 0.1f.
        // Inicializa a taxa com 0.1
        this.taxa = 0.1f;
    }

    // Sobrescrita do método toString para retornar uma representação textual do objeto
    @Override //Anotação que indica que o método está sobrescrevendo um método da superclasse
    public String toString() { //Declaração do método toString que retorna uma string representando o objeto.
        // Retorna uma string com os dados da conta poupança, incluindo dados do cliente e atributos da conta
        return "Dados conta corrente:\n"
                + "Cliente: " + getPessoa().getNome() //Chama o método getNome da classe Pessoa associada à conta.
                + "\nTelefone: " + getPessoa().getTelefone() //Chama o método getTelefone da classe Pessoa associada à conta.
                + "\nAgencia: " + getAgencia()//Chama o método getAgencia da superclasse ContaBancaria.
                + "\nNumero da Conta: " + getNroConta()//Chama o método getNroConta da superclasse ContaBancaria.
                + "\nSaldo: " + getSaldo()//Chama o método getSaldo da superclasse ContaBancaria.
                + "\nTaxa: " + taxa;
    }
}
