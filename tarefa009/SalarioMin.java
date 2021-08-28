import java.util.Scanner;
import java.lang.Math;
import static java.lang.System.*;

public class SalarioMin{

    public static void main(String []args){
        float salario;
        float salarioMin;
        int quantiSalario;

        Scanner in = new Scanner( System.in );

        out.println("Informe o salário mínimo: ");
        salarioMin = in.nextFloat();

        out.println("Informe seu salário: ");
        salario = in.nextFloat();

        quantiSalario = (int)(salario/salarioMin);
        out.println(quantiSalario+"SM=" + (quantiSalario*salarioMin));
    }
}