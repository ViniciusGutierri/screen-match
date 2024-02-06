public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "No Ritmo do Coração";
        meuFilme.anoDeLancamento = 2021;
        meuFilme.duracaoEmMinutos = 111;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9);

        System.out.println("\n\nSoma das avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + meuFilme.totalAvaliacoes);
        System.out.println("Média das avaliações: " + meuFilme.mediaAvaliacoes());

    }
}
