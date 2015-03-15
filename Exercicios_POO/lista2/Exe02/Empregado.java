package lista2.Exe02;

import lista2.Exe01.Pessoa;

import javax.swing.*;

/**
 * Created by WhiteHorse on 21/09/2014.
 */

public class Empregado extends Pessoa {

    private double salario;
    private int cargo;
    private String depart; // 1- N. Médio | 2- N. Superior
    private String msg = "Auxílio Transporte\nAuxílio Alimentação\nPlano de Saúde";

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }

    public void setCargo(int cargo){
        this.cargo = cargo;
    }
    public int getCargo(){
        return cargo;
    }

    public void setDepart(String depart){
        this.depart = depart;
    }
    public String getDepart(){
        return depart;
    }

    public double bonificar(){
        double valor;
        if ( cargo == 1)
            valor = (this.salario * 1.2);
        else
            valor = (this.salario * 1.35);
        return valor;
    }

    public void exibeVantagens(){
        JOptionPane.showMessageDialog(null, "Auxílio Transporte\nAuxílio Alimentação\nPlano de Saúde");
    }
}
