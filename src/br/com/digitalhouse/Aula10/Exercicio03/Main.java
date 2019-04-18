package br.com.digitalhouse.Aula10.Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("Kely",1);
        Aluno aluno02 = new Aluno("Maria",2);
        Aluno aluno03 = new Aluno("Joaquim",3);
        Aluno aluno04 = new Aluno("Alex",4);
        Aluno aluno05 = new Aluno("Carlos",4);

        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno01);
        listaAlunos.add(aluno02);
        listaAlunos.add(aluno03);
        listaAlunos.add(aluno04);

        /*
        neste caso o resultado retornado é true, por causa do metodo equals que compara se existe o mesmo conteudo
        em instancias diferentes, sem a declaração deste metodo só é verificado se o valor está contido na lista
         */
        System.out.println("Retorno do contains: " + listaAlunos.contains(aluno05));


    }

}
