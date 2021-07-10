public class Construcao {
    private Integer quantidadeQuarto;
    private Integer quantideBanheiro;
    private Double metragem;
    private String bairro;
    private String rua;
    private String cep;
    private Integer numero;

    public Construcao(Integer quantidadeQuarto, Integer quantideBanheiro, Double metragem, String bairro, String rua, String cep, Integer numero) {
        this.quantidadeQuarto = quantidadeQuarto;
        this.quantideBanheiro = quantideBanheiro;
        this.metragem = metragem;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }

    public Integer getQuantidadeQuarto() {
        return quantidadeQuarto;
    }

    public void setQuantidadeQuarto(Integer quantidadeQuarto) {
        this.quantidadeQuarto = quantidadeQuarto;
    }

    public Integer getQuantideBanheiro() {
        return quantideBanheiro;
    }

    public void setQuantideBanheiro(Integer quantideBanheiro) {
        this.quantideBanheiro = quantideBanheiro;
    }

    public Double getMetragem() {
        return metragem;
    }

    public void setMetragem(Double metragem) {
        this.metragem = metragem;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
