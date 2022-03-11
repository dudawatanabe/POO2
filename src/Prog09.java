import javax.swing.*;

public class Prog09 {
    public static void main(String args[]) {

        int num=0;
        String msg= "-Resultado- \n";

        num= Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe o numero para a conversão do dia da semana: "));

        if(num<0 || num>6)
        {
            msg +="Digite um número válido para a operação (0-6)";
            JOptionPane.showMessageDialog(null,msg);
        }else {
            if(num== 0) {msg="Domingo";}
            if(num== 1) {msg="Segunda-feira";}
            if(num== 2) {msg="Terça-feira";}
            if(num== 3) {msg="Quarta-feira";}
            if(num== 4) {msg="Quinta-feira";}
            if(num== 5) {msg="Sexta-feira";}
            if(num== 6) {msg="Sabado-feiraProg09";}
        }

        JOptionPane.showMessageDialog(null,msg);




    }
}
