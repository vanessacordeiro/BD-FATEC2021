package main.exerc02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AgenciaBancaria {
    private ArrayList<Conta> contas = new ArrayList<>();
    private Set<String> cpfClientes = new HashSet<>();

    public ArrayList<Conta> buscaTodasContas(){
        return contas;
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
        this.cpfClientes.add(conta.getPessoaConta().getCpf());
    }

    public void apagarConta(Conta conta){
        this.contas.remove(conta);
        this.cpfClientes.remove(conta.getPessoaConta().getCpf());
    }

    public Pessoa listarDadosPessoa(String cpf){
        Pessoa p = null;
        int n = 0;
        for(String c : cpfClientes){
            if(c.equals(cpf)){
                break;
            }
            n++;
        }
        Conta c = contas.get(n);
        return c.getPessoaConta();
    }
}
