package com.reajuste;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * criando classe para cálculo do reajuste
 */
public class Reajuste {
    /**
     * @param args argumento vazio para realizar o calculo do saldo
     */
    public static void main(String []args){

        var in = new Scanner( System.in );
        var saldo = in.nextInt();

        saldo += saldo * 0.15;

        out.println(saldo);
    }
}