package classes;

public class Cachorro extends Animal {
    public Cachorro () {}

    public Cachorro (String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void latir() {
        System.out.println("Au au!");
    }

    public String getTipo() {
        return "cachorro";
    }
}
