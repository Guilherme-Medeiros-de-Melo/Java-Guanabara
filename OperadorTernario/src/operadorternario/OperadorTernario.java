/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author Gui
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, r;
        n1 = 6;
        n2 = 5;
        r = (n1>n2)?0:1;
        System.out.println(r);
        
        int x, y, z;
        boolean t;
        x = 5;
        y = 15;
        z = 10;
        t = (x<y || y==z);
        System.out.println(t);
    }
    
}
