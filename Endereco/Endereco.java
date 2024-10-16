package Endereco;

public class Endereco {

    private String logadouro;
    private String municipio;
    private String bairro;
    private int numero;
    private long cep;

    public Endereco(String logadouro, String municipio,String bairro,int numero,long cep){
        this.bairro = bairro;
        this.cep = cep;
        this.logadouro = logadouro;
        this.municipio = municipio;
        this.numero = numero;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(long cep) {
        this.cep = cep;
    }
    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public long getCep() {
        return cep;
    }
    public String getLogadouro() {
        return logadouro;
    }
    public String getMunicipio() {
        return municipio;
    }
    public int getNumero() {
        return numero;
    }
}