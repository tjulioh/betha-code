public class Programa {
    public static void main(String[] args) {
        Integer numero = 11;

        validar(numero);
    }

    static void validar(Integer numero) {
        try {
            if (numero > 10) {
                throw new ValorMaiorQueOPermitidoException("Valor maior que o permitido!");
            } else if (numero < 3) {
                throw new ValorMenorQueOPermitidoException("Valor menor que o permitido!");
            } else {
                System.out.println("Valor valido!");
            }
        } catch (Exception e) {
            System.out.println("Regra: " + e.getMessage());
        }
    }
}
