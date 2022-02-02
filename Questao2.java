
package questao2;

import javax.swing.JOptionPane;

public class Questao2 {
  public static void main(String[] args){
        int num1 = 1, num2 = 0, pos;
        int numero =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero e veja se esta na sequencia de Fibonacci: "));
        for( pos = 1; num1 < numero; pos++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
            
            }
        if(numero == num1){
            JOptionPane.showMessageDialog(null, "O numero pertece a sequencia de Fibonacci e esta na posição:" + pos);
            }else{
             JOptionPane.showMessageDialog(null, "O numero não pertence a sequencia de Fibonacci");
             JOptionPane.showMessageDialog(null, "O maior numero proximo dele é: " + num1);
        }
    }
    
}
