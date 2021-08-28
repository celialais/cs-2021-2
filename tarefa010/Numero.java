package com.numero;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * classe para receber numero e exibir numero antecessor e sucessor
 */
public class Numero {
    /**
     * @param args parametro vazio para recebimento de numero
     */
    public static void main(String []args){
        var numero = 0;

        out.println("Digite um número: ");
        Scanner in = new Scanner( System.in );

        numero = in.nextInt();

        for (String s : Arrays.asList("Antecessor: " + (numero - 1), "Sucessor: " + (numero + 1))) {
            out.println(s);
        }
    }
}