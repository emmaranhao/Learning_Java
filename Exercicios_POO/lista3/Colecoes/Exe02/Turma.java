package lista3.Colecoes.Exe02;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by WhiteHorse on 23/09/2014.
 */
public class Turma {

    ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    public void inserirAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void excluirTurma(){
        listaAlunos.clear();
        JOptionPane.showMessageDialog(null, "Tamanho da turma atualmente: " + listaAlunos.size());
    }
}
