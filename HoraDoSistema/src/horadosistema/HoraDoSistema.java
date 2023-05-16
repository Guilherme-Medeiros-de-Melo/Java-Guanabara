/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;

/**
 *
 * @author Gui
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("Hora: ");
        System.out.println(relogio.toString());
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        System.out.print("Sua tela é: ");
        System.out.print(Math.round(width));
        System.out.print(" X ");
        System.out.println(Math.round(height));
        if ("pt".equals(System.getProperty("user.language"))){
            System.out.println("Seu Sistema está em português");
        }
    }
    
}
