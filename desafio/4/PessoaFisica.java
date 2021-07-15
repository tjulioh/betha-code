public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;
    private ESexo sexo;

    public PessoaFisica(Integer id, String nome, String endereco, String telefone, String cpf, String rg, ESexo sexo) {
        super(id, nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public ESexo getSexo() {
        return sexo;
    }

    public void setSexo(ESexo sexo) {
        this.sexo = sexo;
    }

    public String getDocumentoPrincipal(){
        return cpf;
    }
}