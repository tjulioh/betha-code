import java.util.Date;
import java.util.List;

public class Folha {
    private Integer id;
    private Funcionario funcionario;
    private Date dataPagamento;
    private List<Desconto> descontos;
    private Double salarioLiquido;

    public Folha(Integer id, Funcionario funcionario, Date dataPagamento, List<Desconto> descontos, Double salarioLiquido) {
        this.id = id;
        this.funcionario = funcionario;
        this.dataPagamento = dataPagamento;
        this.descontos = descontos;
        this.salarioLiquido = salarioLiquido;
    }

    public Folha(Funcionario funcionario, Date dataPagamento, List<Desconto> descontos) {
        new Folha(null, funcionario, dataPagamento, descontos, null);
    }

    public Folha(Funcionario funcionario, Date dataPagamento) {
        new Folha(null, funcionario, dataPagamento, null, null);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public List<Desconto> getDescontos() {
        return descontos;
    }

    public void setDescontos(List<Desconto> descontos) {
        this.descontos = descontos;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void calcular(List<Desconto> descontos, Double bonus) {
        Double salarioBruto = funcionario.getSalarioBruto();
        Double salarioLiquido = salarioBruto;

        salarioLiquido -= Desconto.getIRRF(salarioBruto);
        salarioLiquido -= Desconto.getINSS(salarioBruto);

        if (descontos != null) {
            for (Desconto i : descontos)
                salarioLiquido -= i.getValor();
        }

        if (bonus != null) {
            salarioLiquido += bonus;
        }

        this.salarioLiquido = salarioLiquido;
    }

    public void calcular(List<Desconto> descontos) {
        calcular(descontos, null);
    }

    public void calcular() {
        calcular(null);
    }
}
