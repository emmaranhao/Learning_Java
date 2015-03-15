package lista3.Colecoes.Exe06;

import lista2.Exe01.Aluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WhiteHorse on 24/09/2014.
 */
public class While3e4 {
    // Exercicio 3 - Apenas o método
    ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
    public void excluirTurma(){
        int i = 0;
        while(listaAlunos.get(i) != null){
            listaAlunos.remove(i);
            i++;
        }

        JOptionPane.showMessageDialog(null, "Número de alunos dentro da turma: " );
    }
    // Exercicio 4
    List<Integer> inteiros = new ArrayList<Integer>();
    int somatoria;

    public void Lista(){
        // Adicionando e fazendo a somatoria
        int [] arrayInteiros = {10, 20, 25, 36, 84, 50, 60, 15, 20, 25};
        int i = 0;
        while ( i <= arrayInteiros.length) {
            inteiros.add(arrayInteiros[i]);
            somatoria += arrayInteiros[i];
            i++;
        }
        // Imprimir
        JOptionPane.showMessageDialog(null, "Total acumulado: " + somatoria + " Qtd de elementos: " + inteiros.size()
                + " Média aritmética: " + somatoria/inteiros.size());

    }



}
