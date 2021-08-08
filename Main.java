public class Main {
    public static void main(String[] args) {
        String CPF = "000.000.000-00";
        Pessoa pessoa = new Pessoa(CPF);
        pessoa.setNome("Pessoa 1");
        System.out.println(pessoa);

        String matricula = "2012045123";
        Aluno aluno = new Aluno(CPF, matricula);
        aluno.setNome("Aluno 1");
        System.out.println(aluno);
        System.out.println(aluno.equals(pessoa));

        String SIAPE = "1865418";
        Professor professor = new Professor(CPF, SIAPE);
        professor.setNome("Professor 1");
        System.out.println(professor);
        System.out.println(professor.equals(aluno));

        aluno = new Aluno("111.111.111-11", matricula);
        aluno.setNome("Aluno");
        professor = new Professor("222.222.222-22", SIAPE);

        Instituicao instituicao = new Instituicao("IFBA", 5);

        Turma turma = new Turma();
        turma.setProfessor(professor);
        AlunoMatriculado alunoMatriculado = new AlunoMatriculado(aluno);
        System.out.println(alunoMatriculado);
        turma.addAlunoMatriculado(alunoMatriculado);

        instituicao.addTurma(turma);
        System.out.println(instituicao.obterQuantidadeTurmas());
        System.out.println(instituicao.obterQuantidadeTurmasRestantes());
    }
}
