package lista3.Colecoes.Exe11;

import javax.swing.*;

/**
 * Created by WhiteHorse on 24/09/2014.
 */
public class PrincipalTurma {

    private Turma [] turma;

    public static void main(String[] args) {
        new PrincipalTurma();
    }

    public PrincipalTurma(){
        go(turma);
    }

    public void go(Turma [] turma){
        this.turma = turma;
        for (int i = 0; i < turma.length; i++){
            turma[i].criarTurmas();
            turma[i].associarTurma();
            JOptionPane.showMessageDialog(null, "Nome da turma: " + turma[i].getNomeCurso() + " Qtd da turma: " + turma[i].getNumTurma());
            JOptionPane.showMessageDialog(null, "Alunos cadastrados no curso: ");
            for (int j = 0; j < turma[i].getAlunos().size(); j++) {
                JOptionPane.showMessageDialog(null, "Nome aluno: " + turma[i].getAlunos().get(j).getNome());
                JOptionPane.showMessageDialog(null, "Nome Matricula: " + turma[i].getAlunos().get(j).getMatricula());

            }
        }


    }

}
