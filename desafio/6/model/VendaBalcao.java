package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class VendaBalcao implements Faturavel{
    private Long id;
    private LocalDate dataVenda;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<VendaBalcaoItens> itens;

    public VendaBalcao(Long id, LocalDate dataVenda, Cliente cliente, Vendedor vendedor, List<VendaBalcaoItens> itens) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<VendaBalcaoItens> getItens() {
        return itens;
    }

    public void setItens(List<VendaBalcaoItens> itens) {
        this.itens = itens;
    }

    @Override
    public LocalDate getDataFatura() {
        return this.dataVenda;
    }

    @Override
    public BigDecimal getValorTotalFaturamento() {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for(int i = 0; i <= this.itens.size(); i++){
            valorTotal = valorTotal.add(this.itens.get(i).getValorTotal());
        }
        return valorTotal;
    }

    @Override
    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public Vendedor getVendedor() {
        return this.vendedor;
    }
}
