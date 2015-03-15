package lista3.Exceptions.exe08;

import lista3.Exceptions.exe05.AlexException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexwh on 9/29/14.
 */
public class Exe09 {

    List<Integer> lista = new ArrayList<Integer>();
    int [] arrayLista = {10, 20, 25, 36, 84, 50, 60, 15, 20, 25};

    public static void main(String[] args) {
        new Exe09().go();
    }

    public void go(){
        int soma = 0;
        // Colocar dentro da list
        for (int i : arrayLista){
            lista.add(i);
        }
        // Percorrer
        for (int i : lista){
            soma += i;
        }

        if (soma > 300){
            try {
                throw new LimiteException(soma);
            } catch (LimiteException ae){

            }
        }
    }

}
