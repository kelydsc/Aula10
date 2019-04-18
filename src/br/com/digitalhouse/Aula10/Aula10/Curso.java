package br.com.digitalhouse.Aula10.Aula10;

public class Curso {

    //atributo
    private String nome;

    //construtor padrão

    public Curso() {
    }


    //construtor especifico

    public Curso(String nome) {
        this.nome = nome;
    }


    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    //metodos
}
