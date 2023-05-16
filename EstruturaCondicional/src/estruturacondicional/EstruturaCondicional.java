/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturacondicional;

import java.util.Scanner;
/**
 *
 * @author Gui
 */
public class EstruturaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Scanner ler = new Scanner(System.in);
    float n1 = ler.nextFloat();
    float n2 = ler.nextFloat();
    float m = (n1+n2)/2;
    if(m > 9){
        System.out.println("Parabens zé");
    }
    else if (m < 5){
        System.out.println("éz snebaraP");
    }*/
    Scanner item = new Scanner(System.in);
    System.out.println("Digite");
    int a = item.nextInt();
    int b = a;
    int c = 1;
    String numero = "";
    while (a>=1){
        if (a!=1){ numero += a + " X "; a--; }
        else{ numero += a + " = "; a--;  }
    }
    while (b>=1){
        c *= b;
        b--;
    }
        System.out.println(numero + c);
    }}
