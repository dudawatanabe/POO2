import javax.swing.*;

public class Prog11 {
    public static void main(String args[]) {

        int num=0;
        String msg= "-Resultado- \n";

        num= Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe o numero para a conversão do dia da semana: "));

       switch (num){
               case 0:
           msg="Domingo";break;
               case 1:
           msg="Segunda-feira";break;
               case 2:
           msg="Terça-feira";break;
               case 3:
           msg="Quarta-feira";break;
               case 4:
           msg="Quinta-feira";break;
               case 5:
           msg="Sexta-feira";break;
               case 6:
           msg="Sabado-feiraProg09";break;
           default: msg = "Entre com um valor de 0 a 6";

       }

        JOptionPane.showMessageDialog(null,msg);
    }
}
