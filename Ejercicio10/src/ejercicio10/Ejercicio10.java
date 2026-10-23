/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Camilo Alarcon
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double var1 = (Math.pow(4, 3));
        double var2 = Math.sqrt(81);
        int var3 = 50/2;
        double var4 = (Math.pow(7, 2));
        
        System.out.println("-------Solucion a problema------------------");
        
        boolean resultado = ((var1 + var2 > 70) && (var3 == 25)) || ((18 + 25 <=25) && !(var4 >40));   
        
        System.out.println(resultado);
    }
    
}