package exception;

public class PersonzadaMain {


    public static void main(String[] args) throws Exception {
        PersonalizadaException me = new PersonalizadaException("Detalhes");
        throw me;
    }


}
