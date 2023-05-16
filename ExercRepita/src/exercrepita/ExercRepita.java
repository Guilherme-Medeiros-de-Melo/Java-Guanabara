/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercrepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Gui
 */
public class ExercRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0, contar = 0, par = 0, impar = 0, media = 0, m100 = 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um Número:"));
        s += n;
        if ( n == 0){continue;}
        else{contar++;}
        
        if ( n % 2 == 0){ par++;}
        else { impar++;}
        
        if (n > 100){ m100++;}
        
        media = s / contar;
        
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "Resultado \n\n"
                + "Valores digitados: " + contar
                + "\nTotal de ímpares: " + impar
                + "\nTotal de pares: " + par
                + "\nAcima de 100: " + m100
                + "\nMédia dos valores: " + media);
    }
    
}
