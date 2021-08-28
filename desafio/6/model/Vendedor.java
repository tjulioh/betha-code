package model;

import java.math.BigDecimal;

public class Vendedor extends AbstractPessoa{
    private BigDecimal percentualComissao;
    public Vendedor(Long id, String nome, String cpf, String endereco, String telefone) {
        super(id, nome, cpf, endereco, telefone);
    }

    public BigDecimal getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(BigDecimal percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
