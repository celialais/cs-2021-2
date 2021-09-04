package entidade;

public class Cachorro extends Animal {

    @Override
    public String emitiSom() {
        return "AU AU AU!";

    }

    @Override
    public void acao() {
        System.out.println("Cachorro corre");
    }
}
