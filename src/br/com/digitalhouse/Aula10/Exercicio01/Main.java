package br.com.digitalhouse.Aula10.Exercicio01;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa("Kely",12345);
        Pessoa pessoa02 = new Pessoa("Maria",12345);

        //comparação de objetos instanciados, o resultado retorna false
        System.out.println("Comparação de instancias diferentes: " + pessoa01.equals(pessoa02));

        //comparação do mesmo RG de diferentes objetos instanciados, o resultado retorna verdadeiro
        System.out.println("Comparação de instancias diferentes com o mesmo conteudo: " +
                           pessoa01.getRg().equals(pessoa02.getRg()));

    }

}
