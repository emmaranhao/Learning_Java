package lista2.Exe03;

import lista2.Exe02.Empregado;

import javax.swing.*;

/**
 * Created by WhiteHorse on 21/09/2014.
 */
public class Gerente extends Empregado {
    @Override
    public void setSalario(double salario){
        Gerente.super.setSalario(salario * 1.25);
    }
    @Override
    public void exibeVantagens(){
        JOptionPane.showMessageDialog(null,"Décimo quarto salário\nTelefone Celular Empresarial" );
        Gerente.super.exibeVantagens();
    }


}
