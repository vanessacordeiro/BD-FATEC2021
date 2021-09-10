package classes;

import classes.Animal;

public class Gato extends Animal {
    public Gato () {}

    public Gato (String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void miar() {
        System.out.println("Miauuu!");
    }

    public String getTipo() {
        return "gato";
    }
}
