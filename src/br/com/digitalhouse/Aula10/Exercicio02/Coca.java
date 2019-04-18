package br.com.digitalhouse.Aula10.Exercicio02;

public class Coca {

    private Integer tamanho;
    private Double preco;

    public Coca() {
    }

    public Coca(Integer tamanho, Double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object outraCoca) {

        if((outraCoca instanceof Coca)){

            return false;

        }

        if(((Coca) outraCoca).getTamanho() == this.getTamanho()){

            return true;

        }
        return false;
    }
}