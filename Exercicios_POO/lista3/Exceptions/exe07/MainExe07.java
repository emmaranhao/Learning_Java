package lista3.Exceptions.exe07;

import lista3.Exceptions.exe05.AlexException;

/**
 * Created by alexwh on 9/29/14.
 */
public class MainExe07 {

    public static void main(String[] args) {
        try {
            new Exe07().lancarException();
        } catch (AlexException ae){
            ae.getStackTrace();
        }
    }
}
