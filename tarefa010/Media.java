package com.media;

import static java.lang.System.*;

/**
 * Classe para cálculo da média
 */
public class Media{

    /**
     * @param args argumento vazio
     */
    public static void main(String []args){
        int[] grupo1 = {8, 9, 7};
        int[] grupo2 = {4, 5, 6};
        float media1 = 0;
        float media2 = 0;

        for (int i : grupo1) {
            media1 += i;
        }

        for (int i : grupo2) {
            media2 += i;
        }

        media1 = media1/3;
        out.println("A média aritmética dos números 8,9 e 7: " + media1);

        media2 = media2/3;
        out.println("A média dos números 4, 5 e 6: " + media2);

        float somaTotal = media2 + media1;
        out.println("A soma das duas médias: " + somaTotal);

        out.println("A média das médias: " + somaTotal/2);
    }
}