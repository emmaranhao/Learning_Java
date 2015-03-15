package lista3.Colecoes.Exe02;

/**
 * Created by WhiteHorse on 23/09/2014.
 */
public class Aluno {

    private String nome;
    private int matricula;
    private float nota1, nota2;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public Aluno(){

    }
    // Teste
    public Aluno(String nome, int matricula, float nota1, float nota2){
        this.nome = nome; this.matricula = matricula; this.nota1 = nota1; this.nota2 = nota2;
    }
}
