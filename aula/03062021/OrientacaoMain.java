public class OrientacaoMain {

    static class Programa {
        public static void main(String[] args) {

            Documento documento1 = new Documento();

            documento1.foto = "foto.jpg";
            documento1.nome = "Thiago";
            documento1.codigo = 213;
            documento1.dataNascimento = "2000-06-01";

            System.out.println("Codigo do documento: " + documento1.codigo);

        }
    }

    static class Documento{

        //Estado
        String foto; //Nome do arquivo de imagem
        String nome; //Nome da pessoa
        Integer codigo; //Codigo deste documento
        String dataNascimento; //Data de nasicmento

    }

    static class Corrida {

        public static void main(String[] args) {

            CarroCorrida carroEquipeVelociddade = new CarroCorrida();
            CarroCorrida carroEquipeTrapaceiros = new CarroCorrida();

            Piloto pilotocCarroEquipeVelociddade = new Piloto();
            Piloto pilotoCarroEquipeTrapaceiros = new Piloto();

            pilotocCarroEquipeVelociddade.nome = "Piloto 1";
            pilotocCarroEquipeVelociddade.idade = 25;
            pilotocCarroEquipeVelociddade.habilidade = 75;

            pilotoCarroEquipeTrapaceiros.nome = "Piloto 2";
            pilotoCarroEquipeTrapaceiros.idade = 27;
            pilotoCarroEquipeTrapaceiros.habilidade = 65;

            carroEquipeVelociddade.piloto = pilotocCarroEquipeVelociddade;
            carroEquipeTrapaceiros.piloto = pilotoCarroEquipeTrapaceiros;

            carroEquipeVelociddade.numeroIdentifciacao = 1;
            carroEquipeTrapaceiros.numeroIdentifciacao = 2;

            carroEquipeVelociddade.ligar();
            carroEquipeTrapaceiros.ligar();

            carroEquipeVelociddade.acelerar();
            carroEquipeTrapaceiros.acelerar();

            carroEquipeVelociddade.acelerar();
            carroEquipeTrapaceiros.acelerar();

            carroEquipeVelociddade.acelerar();
            carroEquipeTrapaceiros.velocidadeAtual = 200.0;

            System.out.println(carroEquipeVelociddade.velocidadeAtual);
            System.out.println(carroEquipeTrapaceiros.velocidadeAtual);
        }

    }

    static class Piloto{

        //Estado
        String nome;
        Integer idade;
        Integer habilidade;
    }

    static class CarroCorrida{

        //Estado
        Integer numeroIdentifciacao;
        Double velocidadeAtual = 0.0;
        Double velocidadeMaxima = 100.0;
        Piloto piloto;

        //Método
        void ligar(){
            System.out.println("VRUUUUMmmmmmmmmmmmmmm");
        }

        void desligar(){
            System.out.println("MMMmmmmmmm......");
        }

        void acelerar(){
            velocidadeAtual += 10 + piloto.habilidade * 0.1;
            if(velocidadeAtual > velocidadeMaxima){
                velocidadeAtual = velocidadeMaxima;
            }
        }

        void frear(Integer intensidadeFreada){
            if(intensidadeFreada > 100){
                intensidadeFreada = 100;
            }else if(intensidadeFreada < 0){
                intensidadeFreada = 0;
            }
            velocidadeAtual -= intensidadeFreada * 0.25;

            if (velocidadeAtual < 0){
                velocidadeAtual = 0.0;
            }
        }

    }
}
