public class Filme {
    String nome;
    int anoDeLancamento;
    int totalAvaliacoes;
    int duracaoEmMinutos;
    double somaDasAvaliacoes;
    boolean inclusoNoPlano;

    void exibeFichaTecnica() {
        System.out.printf("Nome do filme: %s", nome);
        System.out.printf("\nAno de lançamento: %d", anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}


