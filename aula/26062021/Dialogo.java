import javax.swing.JOptionPane;

public class Matriz {
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String mensagem = nome + " está fazendo curso java Iniciante";
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
