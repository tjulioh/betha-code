public class Casa extends Construcao{
    private Boolean alvenaria;

    public Casa(Integer quantidadeQuarto, Integer quantideBanheiro, Double metragem, String bairro, String rua, String cep, Integer numero) {
        super(quantidadeQuarto, quantideBanheiro, metragem, bairro, rua, cep, numero);
    }

    public Casa(Integer quantidadeQuarto, Integer quantideBanheiro, Double metragem, String bairro, String rua, String cep, Integer numero, Boolean alvenaria) {
        super(quantidadeQuarto, quantideBanheiro, metragem, bairro, rua, cep, numero);
        this.alvenaria = alvenaria;
    }

    public Boolean getAlvenaria() {
        return alvenaria;
    }

    public void setAlvenaria(Boolean alvenaria) {
        this.alvenaria = alvenaria;
    }
}
