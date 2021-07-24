public class Desconto {
    private Integer id;
    private String descricao;
    private Double valor;

    public Desconto(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public static Double getIRRF(Double valor) {

        if (valor <= 1903.98) {
            return 0.00;
        }

        if (valor >= 1903.99 && valor <= 2826.65) {
            return valor * 0.075;
        }

        if (valor >= 2826.66 && valor <= 3751.05) {
            return valor * 0.15;
        }

        if (valor >= 3751.06 && valor <= 4664.68) {
            return valor * 0.225;
        }

        return valor * 0.275;
    }

    public static Double getINSS(Double valor) {

        if (valor <= 1100.00) {
            return valor * 0.075;
        }

        if (valor >= 1100.01 && valor <= 2203.48) {
            return valor * 0.09;
        }

        if (valor >= 2203.49 && valor <= 3305.22) {
            return valor * 0.12;
        }

        return valor * 0.14;
    }
}
