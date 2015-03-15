package lista3.Exceptions.exe05;

/**
 * Created by alexwh on 9/29/14.
 */
public class AlexException extends Exception {

    private String msg;
    public AlexException(String msg){
        this.msg = msg;
    }

    public void imprimirMsg(){
        System.out.println(this.msg);
    }
}
