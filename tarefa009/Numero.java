import java.util.Scanner;
import static java.lang.System.*;

public class Numero{
    public static void main(String []args){
        int numero = 0;

        out.println("Digite um número: ");
        Scanner in = new Scanner( System.in );

        numero = in.nextInt();

        out.println("Antecessor: " + (numero-1));
        out.println("Sucessor: " + (numero+1));
    }
}