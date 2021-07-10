public class Casa {
    private String endereco;
    private String cep;
    private Boolean alvenaria;
    private Integer numero;
    private Double tamanho;

    public Casa(String endereco, String cep, Boolean alvenaria, Integer numero, Double tamanho) {
        this.endereco = endereco;
        this.cep = cep;
        this.alvenaria = alvenaria;
        this.numero = numero;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "endereco='" + endereco + '\'' +
                ", cep='" + cep + '\'' +
                ", alvenaria=" + alvenaria +
                ", numero=" + numero +
                ", tamanho=" + tamanho +
                '}';
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Boolean getAlvenaria() {
        return alvenaria;
    }

    public void setAlvenaria(Boolean alvenaria) {
        this.alvenaria = alvenaria;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
}