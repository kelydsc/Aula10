package br.com.digitalhouse.Aula10.Exercicio01;

public class Pessoa {

    private String nome;
    private Integer rg;

    public Pessoa(){

    }

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object outraPessoa) {

        //comparação de instancias diferentes
        if(!(outraPessoa instanceof Pessoa)){

            return false;

        //comparação de instancias diferentes com o mesmo conteudo
        }if(((Pessoa) outraPessoa).getRg() == this.getRg()){

            return true;

        }else {

            return false;
        }
    }
}
