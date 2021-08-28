package model;

import java.math.BigDecimal;

public class OrcamentoItens{
    private Long id;
    private Vendavel vendavel;
    private BigDecimal desconto;
    private Integer quantidade;
    private BigDecimal valorTotal;

    public OrcamentoItens(Long id, Vendavel vendavel, BigDecimal desconto, Integer quantidade, BigDecimal valorTotal) {
        this.id = id;
        this.vendavel = vendavel;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vendavel getVendavel() {
        return vendavel;
    }

    public void setVendavel(Vendavel vendavel) {
        this.vendavel = vendavel;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
