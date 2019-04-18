package br.com.digitalhouse.Aula10.Exercicio02;

public class Main {

    public static void main(String[] args) {

        Coca coca01 = new Coca(1,4.0d);
        Coca coca02 = new Coca(1,6.0d);

        //retorna false, porque são 2 instancias diferentes
        System.out.println(coca01.equals(coca02));

        //retorna true, porque apesar de serem 2 instancias diferentes, ambas possuem o mesmo conteudo
        System.out.println(coca01.getTamanho().equals(coca02.getTamanho()));

    }
}
