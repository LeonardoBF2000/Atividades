
package questao5;

import javax.swing.JOptionPane;

public class Questao5 {
    public static void main(String[] args) {
         String frase = JOptionPane.showInputDialog(null, "Escolha a frase para inverter: ");
 String fraseInvertida = new StringBuilder(frase).reverse().toString();
 JOptionPane.showMessageDialog(null, fraseInvertida);
    }
    
}
