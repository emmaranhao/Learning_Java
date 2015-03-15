package lista2.Exe02;

/**
 * Created by WhiteHorse on 21/09/2014.
 */
import lista2.Exe03.Diretor;
import lista2.Exe03.Gerente;

import javax.swing.JOptionPane;
import java.util.Date;

public class Principal_02{

    private final int QTD = 2;
    private Empregado [] empregados = new Empregado[QTD];
    private Gerente gerente = new Gerente();
    private Diretor diretor = new Diretor();
    // Main
    public static void main (String [] args){
        new Principal_02();

    }

    public Principal_02(){
        // Empregados
        for (Empregado e : empregados){
            e = new Empregado();
            e.setNome(JOptionPane.showInputDialog(null, "Digite nome: "));
            e.setData_nasc(new Date());
            e.setTelefone(JOptionPane.showInputDialog(null, "Digite Telefone: "));
            e.setCargo(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite cargo: 1- N. Médio | 2- N.Superior")));
            e.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite salario: ")));
            e.setDepart(JOptionPane.showInputDialog(null, "Digite departamento: "));
            JOptionPane.showMessageDialog(null, "Salario após bonificação: " + e.bonificar());
            e.exibeVantagens();
        }
        // Gerente
        gerente.setNome(JOptionPane.showInputDialog(null, "Digite nome: "));
        gerente.setData_nasc(new Date());
        gerente.setTelefone(JOptionPane.showInputDialog(null, "Digite Telefone: "));
        gerente.setCargo(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite cargo: 1- N. Médio | 2- N.Superior")));
        gerente.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite salario: ")));
        gerente.setDepart(JOptionPane.showInputDialog(null, "Digite departamento: "));
        JOptionPane.showMessageDialog(null, "Salario gerente: " + gerente.getSalario());
        JOptionPane.showMessageDialog(null, "Salário após bonificação dos estudos: " + gerente.bonificar());
        gerente.exibeVantagens();
        // Diretor
        diretor.setNome(JOptionPane.showInputDialog(null, "Digite nome: "));
        diretor.setData_nasc(new Date());
        diretor.setTelefone(JOptionPane.showInputDialog(null, "Digite Telefone: "));
        diretor.setCargo(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite cargo: 1- N. Médio | 2- N.Superior")));
        diretor.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite salario: ")));
        diretor.setDepart(JOptionPane.showInputDialog(null, "Digite departamento: "));
        JOptionPane.showMessageDialog(null, "Salario diretor: " + diretor.getSalario());
        JOptionPane.showMessageDialog(null, "Salário após bonificação dos estudos: " + diretor.bonificar());
        diretor.exibeVantagens(true);

    }

}

