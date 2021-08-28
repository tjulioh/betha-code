package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Faturado {
    private Long id;
    private Faturavel faturavel;
    private Cliente cliente; //Não necessário, já está em faturável
    private LocalDate dataFatura;
    private BigDecimal valorTotal; //Não necessário, já está em faturável

    public Faturado(Long id, Faturavel faturavel, Cliente cliente, LocalDate dataFatura, BigDecimal valorTotal) {
        this.id = id;
        this.faturavel = faturavel;
        this.cliente = cliente;
        this.dataFatura = dataFatura;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Faturavel getFaturavel() {
        return faturavel;
    }

    public void setFaturavel(Faturavel faturavel) {
        this.faturavel = faturavel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataFatura() {
        return dataFatura;
    }

    public void setDataFatura(LocalDate dataFatura) {
        this.dataFatura = dataFatura;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getTotalAplicandoDescontoCliente(){
        BigDecimal desconto = this.valorTotal.multiply(this.faturavel.getCliente().getPercentualDescontoMaximo());
        return this.valorTotal.subtract(desconto);
    }

    public BigDecimal getTotalComissaoVendedor(){
        return this.valorTotal.multiply(this.getFaturavel().getVendedor().getPercentualComissao());
    }
}
