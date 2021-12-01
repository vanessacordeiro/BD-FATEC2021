package main.exerc01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concessionaria {
    private ArrayList<Carro> car = new ArrayList<>();
    private Map<String, Double> tabelaPlacaCarPreco = new HashMap<>() ;

    public ArrayList<Carro> listarCarros(){
        return car;
    }

    public Map<String, Double> imprimirTabelaPreco(){
        return tabelaPlacaCarPreco;
    }

    public Carro listarDadosCarro(String placa){
        for(Carro c: car){
            if(c.getPlaca().equals(placa)){
                return c;
            }
        }
        return null;
    }

    public void addListaCarros(Carro carro){
        this.car.add(carro);
    }

    public void addTabelaPlacaCarPreco(String placa, Double preco){
        tabelaPlacaCarPreco.put(placa, preco);
    }
}
