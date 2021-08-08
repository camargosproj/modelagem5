public class Pessoa {
    private String nome;
    private String CPF;
    //Controctor
    public Pessoa(String CPF) {
        this.CPF = CPF;
    }
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Getters
    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return CPF;
    }
    @Override
    public String toString(){
        return nome + "["+getCPF()+"]";
    }
    @Override
    public boolean equals(Object obj) {
        return getCPF().equals(((Pessoa)obj).getCPF());
    }

}
