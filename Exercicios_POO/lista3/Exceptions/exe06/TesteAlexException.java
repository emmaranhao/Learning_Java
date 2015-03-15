package lista3.Exceptions.exe06;

import lista3.Exceptions.exe05.AlexException;

/**
 * Created by alexwh on 9/29/14.
 */
public class TesteAlexException {

    public static void main(String[] args) {
        try{
            throw new AlexException("Isso deveria ser um erro legal ;(");

        } catch (AlexException ae){
            ae.imprimirMsg();
        }
    }
}
