
package com.mycompany.tabuada01;

public class Tabuada01 {

    public static void main(String[] args) {
        
        int valor, cont = 0, resultado;
        
        valor = 9;
        
        while(cont <= 10){
        resultado = valor * cont;
         System.out.println(valor + " x " + cont + " = " + resultado);
         cont++;
        }
        
        for(int numero = 10; numero >= 0; numero--){
            System.out.println(numero);
        }
       
    }
}
