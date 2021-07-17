public class ProgramaMatricula {
    public static void main(String[] args) {
        Matricula funcionario = ConstrutorMatricula.construir("F",1000.0);
        System.out.println(funcionario.getSalario());

        Matricula estagiario = ConstrutorMatricula.construir("E",1000.0);
        System.out.println(estagiario.getSalario());
    }

    public static class Matricula{
        Double salario;

        public Matricula(Double salario) {
            this.salario = salario;
        }

        public Double getSalario() {
            return salario;
        }

        public void setSalario(Double salario) {
            this.salario = salario;
        }
    }

    public static class Funcionario extends Matricula {

        public Funcionario(Double salario) {
            super(salario);
        }

        @Override
        public Double getSalario() {
            return super.getSalario()+((super.getSalario() / 100)*20);
        }
    }

    public static class Estagiario extends Matricula {

        public Estagiario(Double salario) {
            super(salario);
        }

        @Override
        public Double getSalario() {
            return super.getSalario()+((super.getSalario() / 100)*10);
        }
    }

    public static class ConstrutorMatricula{
        public static Matricula construir(String tipo, Double salario){
            switch (tipo){
                case "F":
                    return new Funcionario(salario);
                case "E":
                    return new Estagiario(salario);
                default:
                    return null;
            }
        }
    }
}
