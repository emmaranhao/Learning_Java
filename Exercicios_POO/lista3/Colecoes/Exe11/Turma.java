package lista3.Colecoes.Exe11;

import lista3.Colecoes.Exe09.Aluno;
import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by WhiteHorse on 24/09/2014.
 */
public class Turma extends Aluno{

    private String nomeCurso;
    private int numTurma;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private Turma [] turma;

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public int getNumTurma() {
        return numTurma;
    }
    public void setNumTurma(int numTurma) {
        this.numTurma = numTurma;
    }

    public void criarTurmas(){
        turma = new Turma[2];
        for (int i = 0; i < turma.length; i++) {
            turma[i].setNomeCurso(JOptionPane.showInputDialog("Digite nome do curso: "));
            turma[i].setNumTurma(Integer.parseInt(JOptionPane.showInputDialog("Digite a id da turma: ")));
        }
    }

    public void associarTurma(){
        for (int i = 0; i< turma.length; i++) {
            turma[i].setAlunos(getListaAlunos());
        }
    }
}
