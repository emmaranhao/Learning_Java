package lista3.Colecoes.Exe04;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by WhiteHorse on 23/09/2014.
 */
public class Lista{

    List<Integer> inteiros = new ArrayList<Integer>();
    int somatoria;

    public static void main(String[] args) {
        new Lista();
    }

    public Lista(){
        // Adicionando elementos com auxilio de um array
        int [] arrayInteiros = {10, 20, 25, 36, 84, 50, 60, 15, 20, 25};
        for (int a : arrayInteiros) {
            inteiros.add(a);
        }

        // UTILIZAR ITERATOR
        for (Iterator<Integer> inter = inteiros.iterator(); inter.hasNext();){
            if (inter.hasNext()){
                System.out.println(inter.next());
                somatoria += inter.next();


            }

        }
        // Imprimir
        JOptionPane.showMessageDialog(null, "Total acumulado: " + somatoria + " Qtd de elementos: " + inteiros.size()
                + " Média aritmética: " + somatoria/inteiros.size());

    }


}
