package conta; //Define que a classe Corrente faz parte do pacote conta.

// Declaração da classe Corrente que herda de ContaBancaria
public class Corrente extends ContaBancaria { //Declara a classe Corrente como uma subclasse de ContaBancaria.
    // Atributo privado para indicar se a conta possui cartão de crédito
    private boolean cartaoCredito; //Declara um atributo privado cartaoCredito do tipo boolean.

    // Método para verificar se a conta possui cartão de crédito
    public boolean isCartaoCredito() { //Método público para obter o valor do atributo cartaoCredito.
        return cartaoCredito;
    }

    // Método para definir se a conta possui cartão de crédito
    public void setCartaoCredito(boolean cartaoCredito) { //Método público para definir o valor do atributo cartaoCredito.
        this.cartaoCredito = cartaoCredito; //Atribui o valor do parâmetro cartaoCredito ao atributo da instância cartaoCredito da classe.
    }

    // Sobrescrita do método toString para retornar uma representação textual do objeto
    @Override //Anotação que indica que o método está sobrescrevendo um método da superclasse.
    public String toString() { //Declaração do método toString que retorna uma string representando o objeto.
        // Retorna uma string com os dados da conta corrente, incluindo dados do cliente e atributos da conta
        return "Dados conta corrente:\n"
                + "Cliente: " + getPessoa().getNome() //Chama o método getNome da classe Pessoa associada à conta.
                + "\nTelefone: " + getPessoa().getTelefone() //Chama o método getTelefone da classe Pessoa associada à conta.
                + "\nAgencia: " + getAgencia()//Chama o método getAgencia da superclasse ContaBancaria.
                + "\nNumero da Conta: " + getNroConta()//Chama o método getNroConta da superclasse ContaBancaria.
                + "\nSaldo: " + getSaldo()// Chama o método getSaldo da superclasse ContaBancaria.
                + "\nCartão de Credito: " + (cartaoCredito ? "Sim" : "Não"); //Condicional que retorna "Sim" se cartaoCredito for true, e "Não" se for false.
    }
}
