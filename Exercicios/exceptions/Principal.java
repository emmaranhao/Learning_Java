package exceptions;

import javax.swing.*;

/**
 * Created by alexwh on 9/22/14.
 */
public class Principal {

    public static void main(String[] args) {

        try {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite valor: "));
            Util.verificaValor(valor);
        } catch (AlexException ae){
            ae.printStackTrace();
            JOptionPane.showMessageDialog(null, "  AWAY!! " + ae.getMessage());
        }
    }

}
