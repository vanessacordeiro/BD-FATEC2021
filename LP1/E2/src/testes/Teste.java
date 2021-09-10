package testes;

import classes.Cachorro;
import classes.Gato;
import classes.Passarinho;

public class Teste {
    public static void main(String[] args) {
        Gato gato1 = new Gato();

        gato1.setNome("Hannah");
        gato1.setIdade(6);
        gato1.setPeso(6);

        Gato gato2 = new Gato("Mia", 8, 3);

        Cachorro cachorro1 = new Cachorro("Billy", 10, 6);

        Passarinho passarinho1 = new Passarinho("Pistolinha", 2, 0.3);

        // Chamando alguns metodos
        System.out.println("O primeiro " + gato1.getTipo() + " é a " + gato1.getNome() + " e faz: ");
        gato1.miar();

        System.out.println("O segundo " + gato2.getTipo() + " é a " + gato2.getNome() + " e faz: ");
        gato2.miar();

        System.out.println("O " + cachorro1.getTipo() + " é a " + cachorro1.getNome() + " e faz: ");
        cachorro1.latir();

        System.out.println("O " + passarinho1.getTipo() + " é a " + passarinho1.getNome() + " e faz: ");
        passarinho1.cantar();
    }
}
