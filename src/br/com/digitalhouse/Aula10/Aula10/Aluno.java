package br.com.digitalhouse.Aula10.Aula10;

public class Aluno {

    //atributo
    private int ra;
    private String nome;
    private String sobreNome;
    private Curso curso;

    //construtor padrão
    public Aluno(){

    }

    //construtor especifico

    public Aluno(int ra, String nome, String sobreNome, Curso curso) {
        this.ra = ra;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.curso = curso;
    }

    //getter e setter
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }


    //metodos
    @Override
    public boolean equals(Object outroAluno) {

        if(!(outroAluno instanceof Aluno)){ //se a instancia for diferente retorna false
            return false;
        }

        //cast(conversão de tipo de dados
        if(((Aluno) outroAluno).getRa() == this.getRa() &&
                ((Aluno) outroAluno).getNome() == this.getNome()){

            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return ra + nome.hashCode();
    }

    @Override
    public String toString() {
        return "RA do aluno: " + getRa() +
               "\nNome do aluno: " + getNome() + " " + getSobreNome() +
               "\nCurso: " + curso.getNome();

    }
}
