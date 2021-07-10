public class Apartamento extends Construcao {

    private Integer andar;
    private Boolean sacada;

    public Apartamento(Integer quantidadeQuarto, Integer quantideBanheiro, Double metragem, String bairro, String rua, String cep, Integer numero) {
        super(quantidadeQuarto, quantideBanheiro, metragem, bairro, rua, cep, numero);
    }

    public Apartamento(Integer quantidadeQuarto, Integer quantideBanheiro, Double metragem, String bairro, String rua, String cep, Integer numero, Integer andar, Boolean sacada) {
        super(quantidadeQuarto, quantideBanheiro, metragem, bairro, rua, cep, numero);
        this.andar = andar;
        this.sacada = sacada;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Boolean getSacada() {
        return sacada;
    }

    public void setSacada(Boolean sacada) {
        this.sacada = sacada;
    }
}
