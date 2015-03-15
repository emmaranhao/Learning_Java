package lista3.Colecoes.Exe09;

import lista3.Colecoes.Exe08.Pessoa;
import lista3.Colecoes.Exe11.Turma;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by WhiteHorse on 24/09/2014.
 */
public class Aluno extends Pessoa {

    private int matricula;
    private final int QTD = 7;
    //private String nomeCurso;
    private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    /*
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    */
    public void inserirAluno(){
        for (int i = 0; i < QTD; i++){
            Aluno aluno = new Aluno();
            aluno.setNome(JOptionPane.showInputDialog("Digite nome: "));
            aluno.setRg(Integer.parseInt(JOptionPane.showInputDialog("Digite RG: ")));
            aluno.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite CPF: ")));
            aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite RG: ")));
    //        aluno.setNomeCurso(JOptionPane.showInputDialog("Digite CPF: "));
            listaAlunos.add(aluno);
        }
    }
    public void imprimirAluno(){
        for (Aluno a : listaAlunos){
            JOptionPane.showMessageDialog(null, "Nome: " + a.getNome() + " RG: " + a.getRg() + " CPF: " + a.getCpf() +
                    " Matricula: " + a.getMatricula());
        }
    }

    public static void main(String[] args) {
        new Aluno().run();
    }

    public void run(){
        inserirAluno();
        imprimirAluno();
    }

}
