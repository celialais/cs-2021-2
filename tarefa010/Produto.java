package com.produto;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Classe produto, declara e calcula valores dos produtos referenciados
 */
public enum Produto {
    ;

    /**
     * peca possui declaracao e calculo
     */
    public static class Peca {

        int codigo;
        int quant;
        double valorUnit;

        /**
         * @param codigo recebe numero de codigo do produto
         * @param quant recebe quantidade do produto
         * @param valorUnit recebe o valor unitario do produto
         */
         Peca(final int codigo, final int quant, final double valorUnit) {
             this.codigo = codigo;
             this.quant = quant;
            this.valorUnit = valorUnit;
        }

    }
    static Peca p1;

    static {
        p1 = new Peca(50, 2, 0.99);
    }

    static Peca p2;

    static {
        p2 = new Peca(60, 5, 50);
    }

    /**
     * @param args vazio para receber o calculo realizado nas declarações anteriores
     */
    public static void main(String []args){

        Scanner in = new Scanner( System.in );
        int ipi = in.nextInt();

        var total = (p1.valorUnit * p1.quant + p2.valorUnit * p2.quant) * (ipi / 100.00 + 1);
        out.printf("R$ %.2f",
                total);
    }
}