package exceptions;

/**
 * Created by alexwh on 9/22/14.
 */
public class Util {

    public static void verificaValor(int valor) throws AlexException{
        if (valor > 100 ){
           throw new AlexException("Você caiu no AlexException");
        }
    }

}
