package br.com.vinicius.screenmatch.principal;

import br.com.vinicius.screenmatch.modelos.Filme;
import br.com.vinicius.screenmatch.modelos.Serie;
import br.com.vinicius.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("No Ritmo do Coração", 2021);
        meuFilme.avalia(10);
        Filme meuFilme2 = new Filme("Um sonho de liberdade", 1994);
        meuFilme2.avalia(10);
        Filme meuFilme3 = new Filme("O Senhor dos Anéis: A Sociedade do Anel", 2001);
        meuFilme3.avalia(10);
        Serie serie = new Serie("How I met your mother", 2005);
        Filme f1 = meuFilme3;

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(meuFilme3);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Will Smith");
        buscaPorArtista.add("Tom Hanks");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("\nLista de titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }
}
