package lista3.Exceptions.exe03;

/**
 * Created by alexwh on 9/29/14.
 */
public class Exe03 {

    public static void main(String[] args) {

        try {
            throw new Exception("Hello World!");
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Passou pelo finally!");
        }
    }
}
