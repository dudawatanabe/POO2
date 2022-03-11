import javax.swing.*;
/* estrutura de repetição WHILE

    while com strings

 */

public class Prog14 {
    public static void main(String args[]) {

        int valor1=0,valor2=0;
        String continua= "sim";

        while (continua.equals("sim")){
            valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor 1:"));

            valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor2"));

            JOptionPane.showMessageDialog(null,"Resultado:\n" + (valor1 + valor2));

            continua = JOptionPane.showInputDialog(null, "Continua ou não?");

    }
    }
}
