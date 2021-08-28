import java.util.Scanner;
import static java.lang.System.*;

public class Reajuste {
    public static void main(String []args){
        int saldo = 0;

        Scanner in = new Scanner( System.in );
        saldo = in.nextInt();

        saldo += (saldo * 0.15);

        out.println(saldo);
    }
}
