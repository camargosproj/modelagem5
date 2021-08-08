public class Aluno extends Pessoa{
    protected String matricula;
    public Aluno(String CPF, String matricula) {
        super(CPF);
        this.matricula = matricula;
    }
    //Getters and Setters
    public String getMatricula() {
        return matricula;
    }

    public String toString(){
        return super.toString()+"["+getMatricula()+"]";
    }
}