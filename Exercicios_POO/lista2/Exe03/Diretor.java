package lista2.Exe03;

import javax.swing.*;

/**
 * Created by WhiteHorse on 21/09/2014.
 */
public class Diretor extends Gerente{

    @Override
    public void setSalario(double salario){
        Diretor.super.setSalario(salario * 1.5);
    }

    @Override
    public void exibeVantagens(){
        JOptionPane.showMessageDialog(null, "Décimo quinto salário\nTParticipação nos lucros");
        Diretor.super.exibeVantagens();

    }

    public void exibeVantagens(boolean permitirVisualizacao){
        if (permitirVisualizacao == true)
            exibeVantagens();
        else
            JOptionPane.showMessageDialog(null, "Sem visualização das vantagens do Diretor");

    }
}
