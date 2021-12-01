package main;

import main.exerc01.Carro;
import main.exerc01.Concessionaria;
import main.exerc01.Cor;
import main.exerc02.AgenciaBancaria;
import main.exerc02.Conta;
import main.exerc02.Pessoa;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    //exerc01
    private static final Concessionaria con = new Concessionaria();

    public static void main(String[] args) {
        // EXERCÍCIO 01
        //exerc01();

        //EXERCÍCIO 02
        exerc02();

        //EXERCÍCIO 03
    }

    public static void exerc01(){
        // criando o carro
        Carro carro1 = new Carro("ABC001", Cor.preto, "Vanessa Cordeiro", 1000000);
        Carro carro2 = new Carro("DEF002", Cor.branco, "João da Silva", 2000000);

        // criando a concessionario
        con.addListaCarros(carro1);
        con.addListaCarros(carro2);

        //Listar carros
        ArrayList<Carro> listaCarros = con.listarCarros();
        int tamanho = listaCarros.size();
        System.out.println("Quantidade de carros na concessionária: " + tamanho);

        int n = 0;
        for(Carro c: listaCarros){
            n++;
            System.out.println(n + "° carro:\nPlaca do carro: " + c.getPlaca() + "\nNome do proprietário: " + c.getNomeProprietario() + "\n");
        }

        //Imprimir tabela de preço
        //adicionar preços
        exerc01_addTabelaPreco(listaCarros);

        System.out.println("\nTabela de Preços:");
        Map<String, Double> tabela = con.imprimirTabelaPreco();
        for(Map.Entry<String, Double> entry: tabela.entrySet()){
            System.out.println(entry.getKey() + " / " + entry.getValue());
        }

        //Listar dados do carro
        n = 0;
        System.out.println("\nDigite a placa do carro que você quer saber os dados:");
        for (Carro c : listaCarros) {
            n++;
            System.out.println(n + " - " + c.getPlaca());
        }

        String escolha = null;
        while (true) {
            System.out.print("Placa: ");
            escolha = input.next();

            if (escolha != null) {
                break;
            }
        }

        Carro dados = con.listarDadosCarro(escolha);
        System.out.println("\nPlaca: " + dados.getPlaca() + "\nCor do carro: " + dados.getCorCarro() + "\nNome do proprietário: " + dados.getNomeProprietario() + "\nDoc do proprietário: " + dados.getDocumentoProprietario());
    }

    public static void exerc01_addTabelaPreco(ArrayList<Carro> listaCarros){
        String check = null;
        do {
            int n = 0;
            System.out.println("\nDigite a placa do carro cadastrado que você quer adicionar um preço:");
            for (Carro c : listaCarros) {
                n++;
                System.out.println(n + " - " + c.getPlaca());
            }

            String escolha = null;
            double preco = 0;
            while (true) {
                System.out.print("Placa: ");
                escolha = input.next();
                System.out.print("Valor: ");
                preco = input.nextDouble();

                if (escolha != null) {
                    break;
                }
            }

            //adicionando a tabela de preços
            con.addTabelaPlacaCarPreco(escolha, preco);

            System.out.println("\nDesejar adicionar mais preços? 'Sim' ou 'Não'");
            check = input.next();

        } while (check.equals("Sim"));
    }

    public static void exerc02(){
        Pessoa p1 = new Pessoa("Vanessa Cordeiro", "111222333-44");
        Pessoa p2 = new Pessoa("Pedro da Silva",  "444333222-11");

        Conta c1 = new Conta(1, 510.00, p1);
        Conta c2 = new Conta(2, 555.00, p1);
        Conta c3 = new Conta(3, 450.00, p2);
        Conta c4 = new Conta(4, 654.00, p2);

        AgenciaBancaria ab = new AgenciaBancaria();

        //Adicionar contas
        ab.adicionarConta(c1);
        ab.adicionarConta(c2);
        ab.adicionarConta(c3);
        ab.adicionarConta(c4);

        //Apagar conta
        ab.apagarConta(c3);

        ArrayList<Conta> contas = ab.buscaTodasContas();

        //Buscar todas as contas
        System.out.println("Todas as contas:");
        for(Conta c : contas){
            System.out.println("Número conta: " + c.getNumeroConta() + " | Valor da conta: " + c.getValorConta() + " | CPF do dono da conta: " + c.getPessoaConta().getCpf());
        }

        //Listar dados da pessoa

    }
}
