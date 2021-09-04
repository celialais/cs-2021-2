package entidade;

import static java.lang.System.*;

public class Veterinario {
    public static void Examinar(Animal animal){
        out.println("Examinando " + animal.emitiSom());
    }
}
