import java.util.Scanner;
import static java.lang.System.*;

public class Produto{

    public static class Peca {

        public int codigo, quant;
        public double valorUnit;

        public Peca(int codigo, int quant, double valorUnit) {
            this.codigo = codigo;
            this.quant = quant;
            this.valorUnit = valorUnit;
        }

    }
    static Peca p1 = new Peca(50, 2, 0.99);
    static Peca p2 = new Peca(60, 5, 50);

    public static void main(String []args){
        int IPI;
        double total = 0;

        Scanner in = new Scanner( System.in );
        IPI = in.nextInt();

        total = (p1.valorUnit * p1.quant + p2.valorUnit * p2.quant) * (IPI/100.00 + 1);
        out.printf("R$ %.2f",
                total);
    }
}