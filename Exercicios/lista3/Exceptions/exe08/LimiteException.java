package lista3.Exceptions.exe08;

/**
 * Created by alexwh on 9/29/14.
 */
public class LimiteException extends Exception {

    public LimiteException(int valor){
        System.out.println("O valor acumulado - " + valor + " - estorou o limite!");
    }
}
