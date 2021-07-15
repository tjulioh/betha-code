public class Programa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(5087,"Thiago JUlio", "Rua Domingos Zanatta", "04801239123", "1204129", "5432523",ESexo.MASCULINO, 3980.50, 3450.70);
        Fornecedor fornecedor = new Fornecedor(1,"Agua Sistemas", "Rua Nereu Ramos", "04845645645","35432523","4124","501234",null,null);
        Cliente cliente = new Cliente(1,"Criciuma", "Rua Domingos Zanatta", "048912414","35432523",ESexo.FEMININO,1651.0,1297.0);

        System.out.println("Cliente Limite: " + cliente.getLimiteUtilizado() + "/" + cliente.getLimiteCrediario());        
        
        System.out.println("Salário Bruto: "+ funcionario.getSalarioBruto());
        funcionario.dissidioAplicar(7.5);
        System.out.println("Salário Bruto com Dissídio: "+ funcionario.getSalarioBruto());

        System.out.println("CNPJ: " + fornecedor.getDocumentoPrincipal());
        System.out.println("CPF: " +funcionario.getDocumentoPrincipal());
    }
}
