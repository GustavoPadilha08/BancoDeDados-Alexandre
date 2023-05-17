package com.mycompany.maiorvalor;

import javax.swing.JOptionPane;

public class MaiorValor {

    public static void main(String[] args) {
      int a, b, c;
      
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a."));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b."));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c."));
        
        if(a > b && a > c){
            JOptionPane.showMessageDialog(null, "A é o maior valor.");
        }
        else{
            if(b > a && b > c){
            JOptionPane.showMessageDialog(null, "B é o maior valor.");
            }
            else{
            JOptionPane.showMessageDialog(null, "C é o maior valor");
            }
        }
    }
}
