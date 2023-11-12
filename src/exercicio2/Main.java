package exercicio2;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Gabriel", "gabriel@gmail.com", "458743682000", "Adm", 5000.0, "01/01/2020", "1234567");
        Funcionario funcionario2 = new Funcionario("José", "jose@gmail.com", "993559712", "Dp", 6000.0, "02/01/2020", "7654321");
        Funcionario funcionario3 = new Funcionario("Paulo", "paulo@gmail.com", "1000322574", "Suprimentos", 5500.0, "03/01/2020", "9876543");
        Funcionario funcionario4 = new Funcionario("Juliana", "juliana@gmail.com", "435464266", "Marketing", 7000.0, "04/01/2020", "2345678");
        Funcionario funcionario5 = new Funcionario("Carolina", "carolina@gmail.com", "23425999", "T.I", 6500.0, "05/01/2020", "3456789");

       
        for (Funcionario funcionario : new Funcionario[]{funcionario1, funcionario2, funcionario3, funcionario4, funcionario5}) {
            funcionario.mostrarDados();
        }

        Empresa empresa = new Empresa("Minha Empresa", "120006667701234");
        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);
        empresa.adicionarFuncionario(funcionario3);
        empresa.adicionarFuncionario(funcionario4);
        empresa.adicionarFuncionario(funcionario5);
    }






    }


}
