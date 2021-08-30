package entidade;


import static java.lang.System.*;

public class AnimalTeste {
    public static void main(String[] args) {
        Animal[] animais = new Animal[10];

        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();

        out.println(cachorro.emitiSom());
        out.println(cavalo.emitiSom());
        out.println(preguica.emitiSom());


        Veterinario veterinario = new Veterinario();

        veterinario.Examinar(cachorro);
        veterinario.Examinar(cavalo);
        veterinario.Examinar(preguica);


        animais[0] = new Cachorro();
        animais[1] = new Cavalo();
        animais[2] = new Preguica();
        animais[3] = new Cachorro();
        animais[4] = new Cavalo();
        animais[5] = new Preguica();
        animais[6] = new Cachorro();
        animais[7] = new Cavalo();
        animais[8] = new Preguica();
        animais[9] = new Cavalo();

        Zoologico.visitaJaulas(animais);

    }

}

