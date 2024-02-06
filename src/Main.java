import br.com.vinicius.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("No Ritmo do Coração");
        meuFilme.setAnoDeLancamento(2021);
        meuFilme.setDuracaoEmMinutos(111);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9);

        System.out.println("\n\nMédia das avaliações: " + meuFilme.mediaAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
    }
}
