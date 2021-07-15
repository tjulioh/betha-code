public class Programa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(5087,"Thiago JUlio", "Rua Domingos Zanatta", "5501239123", "1204129", "5432523",ESexo.MASCULINO, 3980.50, 3450.70);
        Fornecedor fornecedor = new Fornecedor(1,"Agua Sistemas", "Rua Nereu Ramos", "45645645","35432523","4124","501234",null,null);

        System.out.println("Salário Bruto: "+ funcionario.getSalarioBruto());
        funcionario.dissidioAplicar(7.5);
        System.out.println("Salário Bruto com Dissídio: "+ funcionario.getSalarioBruto());

        System.out.println("CNPJ: " + fornecedor.getDocumentoPrincipal());
        System.out.println("CPF: " +funcionario.getDocumentoPrincipal());
    }
}