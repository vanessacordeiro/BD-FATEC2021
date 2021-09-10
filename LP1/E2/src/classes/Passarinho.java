package classes;

import classes.Animal;

public class Passarinho extends Animal {
    public Passarinho () {}

    public Passarinho (String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void cantar() {
        System.out.println("Piu!");
    }

    public String getTipo() {
        return "passarinho";
    }
}
