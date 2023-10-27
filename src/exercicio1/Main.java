package exercicio1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        int opcao;
        RedeSocial rede;
        Publicacao publi1;

    do

    {
        opcao = Integer.parseInt(JOptionPane.showInputDialog("<1>Criar Rede social\n <2>Criar Publicação\n<3>Imprimir\n<4>Sair"));


        switch (opcao) {
            case 1:


                String dataCriacao = JOptionPane.showInputDialog("Data criação: ");
                String nomeUsuario = JOptionPane.showInputDialog("Digite o nome de usuario: ");
                String dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento: ");
                String senha = JOptionPane.showInputDialog("Digite sua senha: ");

                rede = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

                break;

            case 2:


                String dataPublicacao = JOptionPane.showInputDialog("Data da publicação: ");
                String textoPublicacao = JOptionPane.showInputDialog("Digite sua publicação: ");

                String linkMidia = JOptionPane.showInputDialog("link Midia: ");

                publi1 = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);

                rede.publicacoes.add(publi1);
                break;

            case 3:

                break;

            case 4:
                break;
        }}
     while(opcao !=4);

}
    }
