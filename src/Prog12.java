import javax.swing.*;
/* estrutura de repetição FOR

    for (inicialização>; <condição>; <inc/dec>){
        //instruções pode colocar switch, if, FOR; "Deixar a variavel em paz ", se não vai atrapalhar a estrutura
        criar uma outra variavel caso precise mudar a variavel do FOR
        }
 */

public class Prog12 {
    public static void main(String args[]) {

        int num=0;
        String msg= "";

        num= Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe o numero que deseja: "));

        for (int cont=1;cont<=num;cont++){
            msg += cont +"";
           if (cont % 20 == 0){msg= "\n";}


       }

        JOptionPane.showMessageDialog(null,"Sequencia\n" +msg);
    }
}
