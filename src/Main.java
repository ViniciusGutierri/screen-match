import br.com.vinicius.screenmatch.calculos.CalculadoraDeTempo;
import br.com.vinicius.screenmatch.calculos.FiltroRecomendacao;
import br.com.vinicius.screenmatch.modelos.Episodio;
import br.com.vinicius.screenmatch.modelos.Filme;
import br.com.vinicius.screenmatch.modelos.Serie;

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

        Serie serie = new Serie();
        serie.setNome("How I met your mother");
        serie.setAnoDeLancamento(2005);
        serie.setAtiva(false);
        serie.setTemporadas(9);
        serie.setEpisodiosPorTemporada(24);
        serie.setMinutosPorEpisodio(21);
        serie.exibeFichaTecnica();
        System.out.printf("\nDuração para maratonar %s: %d\n", serie.getNome(), serie.getDuracaoEmMinutos());

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Um sonho de liberdade");
        meuFilme2.setAnoDeLancamento(1994);
        meuFilme2.setDuracaoEmMinutos(142);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(serie);
        System.out.println("\nTempo Total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(700);
        filtro.filtra(episodio);
    }
}
