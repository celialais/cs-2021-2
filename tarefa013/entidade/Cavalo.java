package entidade;

public class Cavalo extends Animal {

    @Override
    public String emitiSom() {
        return "IRRRRRIIN!";
    }

    @Override
    public void acao() {
        System.out.println("Cavalo corre");
    }
}
