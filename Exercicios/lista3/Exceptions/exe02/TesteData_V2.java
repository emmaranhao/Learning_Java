package lista3.Exceptions.exe02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by alexwh on 9/29/14.
 */
public class TesteData_V2 {

    SimpleDateFormat novaData = new SimpleDateFormat();

    public TesteData_V2(){
        try {
            Date data = novaData.parse("05/12/2014");
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
