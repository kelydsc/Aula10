package br.com.digitalhouse.Aula10.Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario("Ana",1);
        Funcionario funcionario02 = new Funcionario("Paulo",2);
        Funcionario funcionario03 = new Funcionario("Renato",3);
        Funcionario funcionario04 = new Funcionario("Claudia",4);
        Funcionario funcionario05 = new Funcionario("Fernanda",1);

        List<Funcionario> listaFuncionario = new ArrayList<>();

        listaFuncionario.add(funcionario01);
        listaFuncionario.add(funcionario02);
        listaFuncionario.add(funcionario03);
        listaFuncionario.add(funcionario04);

        /*
        neste caso o resultado retornado é true, por causa do metodo equals que compara se existe o mesmo conteudo
        em instancias diferentes, sem a declaração deste metodo só é verificado se o valor está contido na lista
         */
        System.out.println("Resultado do contains: " + listaFuncionario.contains(funcionario05));
    }
}
