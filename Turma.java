public class Turma {
    private Professor professor;
    private AlunoMatriculado[] alunos = new AlunoMatriculado[40];
    private int qtdAlunos;

    public Turma() {
        qtdAlunos = 0;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public void addAlunoMatriculado(AlunoMatriculado alunoMatriculado){
        if(qtdAlunos<40){
            alunos[qtdAlunos] = alunoMatriculado;
            qtdAlunos++;
        }
    }
}
