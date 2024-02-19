package br.com.vinicius.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliado no momento!");
        } else {
            System.out.println("Adicione a sua lista e assista depois!");
        }
    }
}
