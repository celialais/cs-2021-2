package com.idade;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Essa classe converte anos, meses e informados em dias.
 * @author Iolanda de Paula
 */
public class Idade {
    /**
     * @param args vazio para receber dados.
     */
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        out.println("Digite os anos: ");
        int anos = in.nextInt(); // recebe anos
        out.println("Digite os meses: ");
        int meses = in.nextInt(); // recebe meses
        out.println("Digite os dias: ");
        int dias = in.nextInt(); // recebe dias
/*
  A partir dos dados recebidos é calculado a quantidade de dias
 */
        dias += (anos * 365) + (meses * 30);
        out.println("Conversão em dias: ");
        out.println(dias);
    }
}