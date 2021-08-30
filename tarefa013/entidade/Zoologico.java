package entidade;

import static java.lang.System.*;

public class Zoologico {

    public static void visitaJaulas(Animal[] animais) {

        for (Animal a: animais)
            {
                out.println(a.emitiSom());

                if (a instanceof Cachorro || a instanceof Cavalo){
                    a.acao();
                }
            }
    }
}
