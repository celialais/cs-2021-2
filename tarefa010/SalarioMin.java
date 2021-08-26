package com.salariomin;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * Classe de recebimento e calculo da quantidade de salario minimo
 */
public class SalarioMin{

    /**
     * @param args argumento vazio para recebimento do valor
     */
    public static void main(String []args){
        float salario;
        float salarioMin;

        Scanner in = new Scanner( System.in );

        out.println("Informe o salário mínimo: ");
        salarioMin = in.nextFloat();

        out.println("Informe seu salário: ");
        salario = in.nextFloat();

        int quantiSalario = (int) (salario / salarioMin);
        out.println(quantiSalario+"SM=" + (quantiSalario*salarioMin));
    }
}