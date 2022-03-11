import javax.swing.*;
/* estrutura de repetição WHILE

    while ( <condição> ){ definir a condição ANTES de entrar
        //instruções
        [break;]
        }
 */

public class Prog13 {
    public static void main(String args[]) {

        int num=0, cont = 1;
        String msg= "";

        num= Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe o numero que deseja: "));

         while (cont <= num) {
             msg += cont + " ";
             cont++;
         }
        JOptionPane.showMessageDialog(null,"Sequencia\n" +msg);
    }
}
