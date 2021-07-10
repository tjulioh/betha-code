public class Hierarquia {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Thiago";
        pessoa.cpf = "381.390.249-88";
        pessoa.rg = "45.136.757-1";
        pessoa.altura = 1.75;
        pessoa.peso = 65.5;
        pessoa.dataNascimento = "1999-08-01";

        Filiacao pai = new Filiacao();
        Filiacao mae = new Filiacao();
        mae.nome = "Maria";
        mae.tipo = FiliacaoEnum.MAE;
        pai.nome = "Joao";
        pai.tipo = FiliacaoEnum.PAI;
        pessoa.filiacao = new Filiacao[2];
        pessoa.filiacao[0] = pai;
        pessoa.filiacao[1] = mae;

        System.out.println("Nome da Pessoa: " + pessoa.nome);
        pessoa.getIMC();

        for (Filiacao i:pessoa.filiacao){
            System.out.println("Nome: " + i.nome + " - Tipo: " + i.tipo);
        }

    }

    //Criar uma classe de pessoa, com os atributos nome, cpf, rg, altura, peso, data nascimento, filiação.
    public static class Pessoa {

        String nome = "";
        String cpf = "";
        String rg = "";
        Double altura = 0.0;
        Double peso = 0.0;
        String dataNascimento = "";
        Filiacao[] filiacao;

        //Criar o método getIMC()
        public void getIMC(){
            System.out.println("Valor do seu IMC: " + String.format("%02.2f", peso / (Math.pow(altura, 2))));
        }

    }

    static class Filiacao {
        String nome = "";
        FiliacaoEnum tipo;
    }

    public enum FiliacaoEnum {
        PAI,
        MAE;
    }

}