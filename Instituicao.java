public class Instituicao {
    private String nome;
    private int qtdTurmas;
    private Turma[] turmas;
    private int qtdTumasCadastradas;
    public Instituicao(String nome, int qtdTurmas ) {
        this.nome = nome;
        turmas = new Turma[qtdTurmas];
        qtdTumasCadastradas = 0;
    }

    public int obterQuantidadeTurmas() {
        return qtdTumasCadastradas;
    }
    public void addTurma(Turma turma){
        if(qtdTumasCadastradas<turmas.length){
            turmas[qtdTumasCadastradas] = turma;
            qtdTumasCadastradas++;
        }
    }
    public int obterQuantidadeTurmasRestantes(){
        return turmas.length - qtdTumasCadastradas;
    }
    public String getNome() {
        return nome;
    }
}
