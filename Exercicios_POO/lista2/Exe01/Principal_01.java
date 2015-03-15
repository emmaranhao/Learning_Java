package lista2.Exe01;

/**
 * Created by WhiteHorse on 21/09/2014.
*/
import javax.swing.*;
import java.util.Date;


public class Principal_01{

    private final int QTD = 10;
    private Aluno [] alunos = new Aluno[QTD];

    public static void main (String [] args){
        new Principal_01();
    }

    public Principal_01(){

        for (Aluno a : alunos){
            a = new Aluno();
            a.setNome(JOptionPane.showInputDialog(null, "Digite nome: "));
            a.setData_nasc(new Date()); // Padrão, testes!
            a.setTelefone(JOptionPane.showInputDialog(null, "Digite telefone: "));
            a.setNota1(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite primeira nota: ")));
            a.setNota2(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite segunda nota: ")));
            a.setNota3(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite terceira nota: ")));
            a.checar();
        }

    }


}

