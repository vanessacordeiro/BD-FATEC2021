package main.exerc02;

public class Conta {
    private int numeroConta;
    private Double valorConta;
    private Pessoa pessoaConta;

    public Conta() {}

    public Conta(int numeroConta, Double valorConta, Pessoa pessoaConta) {
        this.numeroConta = numeroConta;
        this.valorConta = valorConta;
        this.pessoaConta = pessoaConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Double getValorConta() {
        return valorConta;
    }

    public Pessoa getPessoaConta() {
        return pessoaConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setValorConta(Double valorConta) {
        this.valorConta = valorConta;
    }

    public void setPessoaConta(Pessoa pessoaConta) {
        this.pessoaConta = pessoaConta;
    }
}
