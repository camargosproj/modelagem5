public class AlunoMatriculado {
    private Aluno aluno;
    private int faltas;
    private float nota1, nota2, nota3;

    public AlunoMatriculado(Aluno aluno) {
        this.aluno = aluno;
    }
    public Aluno getAluno(){
        return aluno;
    }
    @Override
    public String toString(){
        return getAluno().toString()+"[Faltas: " +faltas+"][Nota:"+nota1+",Nota:"+nota2+",Nota:"+nota3+"]";
    }
}
