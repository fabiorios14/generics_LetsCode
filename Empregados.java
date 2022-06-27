public class Empregados {

    private String nome;
    private Integer matricula;


    public Empregados(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "[Matricula: " + matricula + ", Nome: " + nome + "]";
    }

}
