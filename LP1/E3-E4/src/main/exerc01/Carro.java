package main.exerc01;

public class Carro {
    private String placa;
    private Cor corCarro;
    private String nomeProprietario;
    private int documentoProprietario;

    public Carro() {}

    public Carro(String placa, Cor corCarro, String nomeProprietario, int documentoProprietario) {
        this.placa = placa;
        this.corCarro = corCarro;
        this.nomeProprietario = nomeProprietario;
        this.documentoProprietario = documentoProprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public Cor getCorCarro() {
        return corCarro;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public int getDocumentoProprietario() {
        return documentoProprietario;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCorCarro(Cor corCarro) {
        this.corCarro = corCarro;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public void setDocumentoProprietario(int documentoProprietario) {
        this.documentoProprietario = documentoProprietario;
    }
}
