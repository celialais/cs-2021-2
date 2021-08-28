import java.util.Scanner;
import static java.lang.System.*;

public class Idade {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        out.println("Digite os anos: ");
        int anos = in.nextInt();
        out.println("Digite os meses: ");
        int meses = in.nextInt();
        out.println("Digite os dias: ");
        int dias = in.nextInt();

        dias += (anos * 365) + (meses * 30);
        out.println("Conversão em dias: ");
        out.println(dias);
    }
}