package model;

import java.util.Date;

public class Cliente {

    private Integer id;
    private String nome;
    private String documento;
    private Double altura;
    private Double peso;
    private Date dataNascimento;
    private Long cidadeId;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String documento, Double altura, Double peso, Date dataNascimento, Long cidadeId) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.altura = altura;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.cidadeId = cidadeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(Long cidadeId) {
        this.cidadeId = cidadeId;
    }
}
