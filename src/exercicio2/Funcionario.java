package exercicio2;

public class Funcionario extends Pessoa {


    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean estaNaEmpresa;

  public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada, String rg) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.estaNaEmpresa = true;
    }


public void bonificar(double aumento) {
        this.salario += aumento;
    }

    public void demitir() {
        this.estaNaEmpresa = false;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Entrada: " + dataEntrada);
        System.out.println("RG: " + rg);
        System.out.println("Na Empresa: " + (estaNaEmpresa ? "Sim" : "Não"));
        System.out.println("\n");
    }

  
}
