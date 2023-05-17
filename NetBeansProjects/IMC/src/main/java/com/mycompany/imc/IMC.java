package com.mycompany.imc;

import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {
        String inputPeso = JOptionPane.showInputDialog("Digite seu peso em quilogramas.");
        double peso = Double.parseDouble(inputPeso);
        
        String inputAltura = JOptionPane.showInputDialog("Digite sua altura em metros.");
        double altura = Double.parseDouble(inputAltura);
        
        double imc = peso / (altura * altura);
        
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc));
    }
}
