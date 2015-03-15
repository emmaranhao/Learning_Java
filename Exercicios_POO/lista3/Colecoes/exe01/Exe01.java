package lista3.Colecoes.exe01;

import javax.swing.*;
import java.util.LinkedList;

/**
 * Created by WhiteHorse on 23/09/2014.
 */
public class Exe01 {

    LinkedList<String> listaStrings = new LinkedList<String>();

    public static void main(String[] args) {
        new Exe01();
    }

    public Exe01(){
        for (int i = 0; i < 10; i ++){
            listaStrings.add(JOptionPane.showInputDialog("Digite uma string: "));
        }

        for(String e : listaStrings){
            System.out.println(e);
        }
    }


}
