package exceptions;

import javax.swing.*;

/**
 * Created by alexwh on 9/22/14.
 */
public class AlexException extends Exception {

    public AlexException(){
        super("Valor Inválido!");
    }

    public AlexException(String msg){
        super(msg);
    }

}
