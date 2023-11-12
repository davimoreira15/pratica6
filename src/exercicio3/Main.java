package exercicio3;

public class Main {
    public static void main(String[] args) {


    ArrayList<Artigo> listaArtigos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Artigo artigo = new Artigo("Artigo " + i, "Resumo do Artigo " + i, "Autor " + i);
            listaArtigos.add(artigo);
        }

        
Edicao edicao = new Edicao(1, 1, "01/01/2023", 1000);
        for (Artigo artigo : listaArtigos) {
            edicao.adicionaArtigo(artigo);
        }

        RevistaCientifica revista = new RevistaCientifica("Revista de Ciências", 1234567890, "Mensal");
        revista.adicionaEdicao(edicao);








    }
}
