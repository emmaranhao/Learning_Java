package lista3.Colecoes.Exe05;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by WhiteHorse on 24/09/2014.
 */
public class ListaSet {


    Set<Integer> inteiros = new HashSet<Integer>();
    int somatoria;

    public ListaSet(){
        // Adicionando e fazendo a somatoria
        int [] arrayInteiros = {10, 20, 25, 36, 84, 50, 60, 15, 20, 25};
        for (int a : arrayInteiros) {
            inteiros.add(a);
            somatoria += a;
        }
        // Imprimir
        JOptionPane.showMessageDialog(null, "Total acumulado: " + somatoria + " Qtd de elementos: " + inteiros.size()
                + " Média aritmética: " + somatoria / inteiros.size());

    }

}
