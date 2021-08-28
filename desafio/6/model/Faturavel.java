package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Faturavel {
    public LocalDate getDataFatura();
    public BigDecimal getValorTotalFaturamento();
    public Cliente getCliente();
    public Vendedor getVendedor();
}
