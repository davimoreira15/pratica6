package exercicio2;

public class Empresa {

    String nome;
    String cnpj;
    int qtdeDeFuncionarios;
    Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionarios = 0;
        this.funcionarios = new Funcionario[100];
    }

 public void adicionarFuncionario(Funcionario funcionario) {
        if (qtdeDeFuncionarios < 100) {
            funcionarios[qtdeDeFuncionarios] = funcionario;
            qtdeDeFuncionarios++;
            System.out.println(funcionario.nome + " adicionado à empresa.");
        } else {
            System.out.println("limite de funcionários atingido.");
        }
    }


  
}
