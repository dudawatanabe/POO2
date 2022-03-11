import javax.swing.*;
import java.util.Locale;

public class Prog05 {
    public static void main(String[] args) {
        String texto = "Programação Orientada a Objetos";
        String texto2 = texto.replace("Orientada a Objetos", "OO");
        String msg= "";

            msg= "Texto padrão: " + texto + "\n" +
                 "Tamanho: " + texto.length() + "\n" +
                 "Maiusculo: " + texto.toUpperCase() + "\n" +
                 "Posicao de 'Orientada': " + texto.indexOf("Orientada") + "\n" +
                 "Nova String: " + texto2 + "\n" +
                 "Minusculo: " + texto.toLowerCase();

            JOptionPane.showMessageDialog(null, msg.concat("\n\nFim da mensagem!"));

        String texto4 = "Suco de Abacaxi e Limao";
        String texto5 = texto4.replace("Abacaxi","Acerola");
        String msg2= "";

        msg2 = "Original: " +texto4 + "\n" +
                "Minusculo: " +texto4.toLowerCase() + "\n" +
                "Maiusculo: " +texto4.toUpperCase() + "\n" +
                "Contagem: " +texto4.length() + "\n" +
                "Novo texto: " + texto5;

        JOptionPane.showMessageDialog(null, msg2.concat("\n\n Fim! "));
    }


}
