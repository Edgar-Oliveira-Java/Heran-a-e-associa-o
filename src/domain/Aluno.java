package domain;

public class Aluno extends Pessoa {
    private Curso curso;

    public Aluno(String name, int age, Curso curso) {
        super(name, age);
        this.curso = curso;
    }

    {
        System.out.println(this.name);
    }
}
