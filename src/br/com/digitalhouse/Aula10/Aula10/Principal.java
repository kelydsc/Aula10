package br.com.digitalhouse.Aula10.Aula10;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Curso android = new Curso("Mobile Android");
        Curso fullStack = new Curso("Web Full Stack");

        Aluno alunoKely = new Aluno(1,"Kely","dos Santos",android);
        Aluno alunoMaria = new Aluno(2,"Maria","da Silva",fullStack);
        Aluno alunoAlex = new Aluno(3,"Alexandre","dos Santos",fullStack);
        Aluno alunoAlexandre = new Aluno(3,"Alexandre","dos Santos",fullStack);
        Aluno alunoJoaquim = new Aluno(4,"Joaquim","da Silva",android);

        //cria lista vazia
        List<Aluno> alunos = new ArrayList<>();

        //adiciona item na lista
        alunos.add(alunoKely);
        alunos.add(alunoMaria);
        alunos.add(alunoAlex);
        //alunos.add(alunoAlexandre);
        alunos.add(alunoJoaquim);

        //comparações com equals:
        System.out.println(alunoKely.equals(alunoMaria));//neste caso irá retornar false

        //neste caso irá retornar false, pq são objetos diferentes que ocupam o espaço na memoria diferente
        System.out.println(alunoAlex.equals(alunoAlexandre));

        //retorna true, pq existe 2 objetos com o mesmo conteudo: RA  e Nome
        System.out.println("Retorno do contains: " + alunos.contains(alunoAlexandre));

        //imprime os dados do toString
        System.out.println(alunos.toString());

        System.out.println(alunoAlex.toString());

        //imprime os dados do hashCode
        System.out.println("Hash Code de alunos: " + alunos.hashCode());

        System.out.println("Hash Code: "+ alunoAlexandre.getNome() + " " + alunoAlexandre.hashCode());
    }
}
