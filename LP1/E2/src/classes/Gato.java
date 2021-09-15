package classes;

public class Gato extends Animal {

    public Gato() {}

    public Gato (String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void miar() {
        System.out.println("Miauuu!");
    }

    public String getTipo() {
        return "gato";
    }
}
