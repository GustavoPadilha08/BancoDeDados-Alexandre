

package com.mycompany.valores_par;

import javax.swing.JOptionPane;


public class Valores_par {

    public static void main(String[] args) {
      int v1, v2, v3, v4;
      
      v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor."));
      v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor."));
      v3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor."));
      v4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor."));
      
            if (v1 %2 == 0){
          JOptionPane.showMessageDialog(null, v1 + " é divisivel por 2.");
      }
      
            if (v2 %2 == 0){
          JOptionPane.showMessageDialog(null, v2 + " é divisivel por 2.");
      }
            
                  if (v3 %2 == 0){
          JOptionPane.showMessageDialog(null, v3 + " é divisivel por 2.");
      }
                  
            if (v4 %2 == 0){
          JOptionPane.showMessageDialog(null, v4 + " é divisivel por 2.");
      }
      
    }
}
