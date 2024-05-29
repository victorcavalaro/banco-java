package play; //Define o pacote do qual a classe BancoExe faz parte.

import cliente.Fisica; // Importa a classe Fisica do pacote cliente
import cliente.Juridica; // Importa a classe Juridica do pacote cliente
import cliente.Pessoa; // Importa a classe Pessoa do pacote cliente
import conta.Corrente; // Importa a classe Corrente do pacote conta
import conta.Poupanca; // Importa a classe Poupanca do pacote conta
import javax.swing.JOptionPane; // Importa a classe JOptionPane para caixas de diálogo

public class BancoExe { //Declara a classe BancoExe.
    public static void main(String[] args) { //Declara o método principal main que inicia a execução do programa.
        // Arrays para armazenar objetos Fisica, Juridica, Corrente e Poupanca
        Fisica vetorPF[] = new Fisica[10]; //Cria um array de objetos Fisica com capacidade para 10 elementos.
        Juridica vetorPJ[] = new Juridica[10]; //Cria um array de objetos Juridica com capacidade para 10 elementos.
        Corrente vetorCC[] = new Corrente[10]; //Cria um array de objetos Corrente com capacidade para 10 elementos.
        Poupanca vetorCP[] = new Poupanca[10]; //Cria um array de objetos Poupanca com capacidade para 10 elementos.
        
        // Contadores para acompanhar quantos objetos foram inseridos em cada array
        int contVetorPF = 0; // Inicializa um contador para acompanhar o número de Fisica adicionados.
        int contVetorPJ = 0; // Inicializa um contador para acompanhar o número de Juridica adicionados.
        int contVetorCC = 0; // Inicializa um contador para acompanhar o número de Corrente adicionados.
        int contVetorCP = 0; // Inicializa um contador para acompanhar o número de Poupanca adicionados.
        
        int opcao; // Declara uma variável para armazenar a opção escolhida pelo usuário no menu.
        do { // Cria um loop do-while que continua até que a opção selecionada seja 9.
            opcao = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Digite uma opção:\n"
                    + "1 - Inserir Pessoa Física.\n"
                    + "2 - Inserir Pessoa Jurídica.\n"
                    + "3 - Inserir Conta Corrente.\n"
                    + "4 - Inserir Conta Poupança.\n"
                    + "5 - Consultar Pessoa Física.\n"
                    + "6 - Consultar Pessoa Jurídica.\n"
                    + "7 - Consultar Dados Conta Corrente.\n"
                    + "8 - Consultar Dados Conta Poupança.\n"
                    + "9 - Para sair."
                )
            );
            
            // Switch case para tratar a opção selecionada pelo usuário
            switch(opcao) { // Inicia uma estrutura de decisão switch baseada na opção escolhida pelo usuário.
                case 1: // Executa o bloco de código para a opção 1 e então sai do switch.
                    // Inserir Pessoa Física
                    Fisica f = inserirPessoaFisica();
                    vetorPF[contVetorPF] = f;
                    contVetorPF++;
                    break;
                case 2:
                    // Inserir Pessoa Jurídica
                    Juridica j = inserirPessoaJuridica();
                    vetorPJ[contVetorPJ] = j;
                    contVetorPJ++;
                    break;
                case 3:
                    // Inserir Conta Corrente
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente"); //Exibe uma caixa de diálogo para entrada de dados.
                    String tipoCliente = JOptionPane.showInputDialog("Digite F para Pessoa Física\n" + "Digite J para Jurídica"); // Exibe uma caixa de diálogo para entrada de dados.
                    int pos = -1;
                    boolean achouF = false;
                    boolean achouJ = false;

                    // Busca pelo cliente com base no tipo e nome fornecido
                    if (tipoCliente.equals("F")) {
                        for(int i = 0; i < contVetorPF; i++) {
                            if (nome.equals(vetorPF[i].getNome())) {
                                pos = i;
                                achouF = true;
                            }
                        }
                    } else if(tipoCliente.equals("J")) {
                        for(int i = 0; i < contVetorPJ; i++) {
                            if (nome.equals(vetorPJ[i].getNome())) {
                                pos = i;
                                achouJ = true;
                            }
                        }
                    }

                    // Inserir Conta Corrente com base no cliente encontrado
                    if(achouF) {
                        Corrente c = inserirContaCorrente(vetorPF[pos]);
                        vetorCC[contVetorCC] = c;
                        contVetorCC++;
                    } else if(achouJ) {
                        Corrente c = inserirContaCorrente(vetorPJ[pos]);
                        vetorCC[contVetorCC] = c;
                        contVetorCC++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                    }
                    break;
                case 4:
                    // Inserir Conta Poupança
                    nome = JOptionPane.showInputDialog("Digite o nome do cliente");
                    tipoCliente = JOptionPane.showInputDialog("Digite F para Pessoa Física\n" + "Digite J para Jurídica");
                    pos = -1;
                    achouF = false;
                    achouJ = false;

                    // Busca pelo cliente com base no tipo e nome fornecido
                    if (tipoCliente.equals("F")) {
                        for(int i = 0; i < contVetorPF; i++) {
                            if (nome.equals(vetorPF[i].getNome())) { // equals(...) Método que verifica se dois objetos são iguais.
                                pos = i;
                                achouF = true;
                            }
                        }
                    } else if(tipoCliente.equals("J")) {
                        for(int i = 0; i < contVetorPJ; i++) {
                            if (nome.equals(vetorPJ[i].getNome())) {
                                pos = i;
                                achouJ = true;
                            }
                        }
                    }

                    // Inserir Conta Poupança com base no cliente encontrado
                    if(achouF) {
                        Poupanca p = inserirContaPoupanca(vetorPF[pos]);
                        vetorCP[contVetorCP] = p;
                        contVetorCP++;
                    } else if(achouJ) {
                        Poupanca p = inserirContaPoupanca(vetorPJ[pos]);
                        vetorCP[contVetorCP] = p;
                        contVetorCP++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                    }
                    break;
                case 5:
                    // Consultar todas as Pessoas Físicas cadastradas
                    for (int i = 0; i < contVetorPF; i++) {
                        JOptionPane.showMessageDialog(null, vetorPF[i]); // Exibe informações das pessoas físicas
                    }
                    break;
                case 6:
                    // Consultar todas as Pessoas Jurídicas cadastradas
                    for (int i = 0; i < contVetorPJ; i++) {
                        JOptionPane.showMessageDialog(null, vetorPJ[i]); // Exibe informações das pessoas jurídicas
                    }
                    break;
                case 7:
                    // Consultar todas as Contas Correntes cadastradas
                    for (int i = 0; i < contVetorCC; i++) {
                        JOptionPane.showMessageDialog(null, vetorCC[i]); // Exibe informações das contas correntes
                    }
                    break;
                case 8:
                    // Consultar todas as Contas Poupanças cadastradas
                    for (int i = 0; i < contVetorCP; i++) {
                        JOptionPane.showMessageDialog(null, vetorCP[i]); // Exibe informações das contas poupanças
                    }
                    break;
                case 9:
                    // Sair do programa
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!\nTente novamente");
            }
        } while (opcao != 9); // Continua executando até que a opção seja 9 (sair)
    }
    
    // Método para inserir uma nova Pessoa Física
    public static Fisica inserirPessoaFisica() { //Declara um método estático para criar e retornar um objeto Fisica.
        Fisica f = new Fisica();
        f.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        f.setEndereco(JOptionPane.showInputDialog("Digite o endereço do cliente: "));
        f.setEmail(JOptionPane.showInputDialog("Digite o e-mail do cliente: "));
        f.setTelefone(JOptionPane.showInputDialog("Digite o telefone do cliente: "));
        f.setCpf(JOptionPane.showInputDialog("Digite o CPF do cliente: "));
        return f;
    }
    
    // Método para inserir uma nova Pessoa Jurídica
    public static Juridica inserirPessoaJuridica() { // Declara um método estático para criar e retornar um objeto Juridica.
        Juridica j = new Juridica();
        j.setNome(JOptionPane.showInputDialog("Digite o nome da empresa: "));
        j.setEndereco(JOptionPane.showInputDialog("Digite o endereço da empresa: "));
        j.setEmail(JOptionPane.showInputDialog("Digite o e-mail da empresa: "));
        j.setTelefone(JOptionPane.showInputDialog("Digite o telefone da empresa: "));
        j.setCnpj(JOptionPane.showInputDialog("Digite o CNPJ da empresa: "));
        return j;
    }
    
    // Método para inserir uma nova Conta Corrente
    public static Corrente inserirContaCorrente(Pessoa p) { //Declara um método estático para criar e retornar um objeto Corrente associado a uma Pessoa.
        Corrente c = new Corrente();
        c.setAgencia("0001"); // Define a agência
        c.setPessoa(p); // Associa a pessoa à conta
        c.setSaldo(0); // Define o saldo inicial como zero
        c.setNroConta(JOptionPane.showInputDialog("Digite um número para a conta: "));
        c.setSenha(JOptionPane.showInputDialog("Digite uma senha:"));
        String credito = JOptionPane.showInputDialog("Deseja Cartão de Crédito? (S)im ou (N)ão:");
        c.setCartaoCredito(false);
        if (credito.equals("S")) {
            c.setCartaoCredito(true); // Define se a conta terá cartão de crédito
        }
        return c;
    }
    
    // Método para inserir uma nova Conta Poupança
    public static Poupanca inserirContaPoupanca(Pessoa p) { //Declara um método estático para criar e retornar um objeto Poupanca associado a uma Pessoa.
        Poupanca poupa = new Poupanca();
        poupa.setAgencia("0001"); // Define a agência
        poupa.setPessoa(p); // Associa a pessoa à conta
        poupa.setSaldo(0); // Define o saldo inicial como zero
        poupa.setNroConta(JOptionPane.showInputDialog("Digite um número para a conta: "));
        poupa.setSenha(JOptionPane.showInputDialog("Digite uma senha:"));
        return poupa;
    }
}
