/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Camilo Alarcon
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double var1 = Math.sqrt(225);
        double var2 = (Math.pow(5, 2));
        int var3 = 120/4;
        
        System.out.println("-------Solucion a problema------------------");
        
        boolean resultado = !(var1 + var2 < 50) && (var3 == 30);   
        
        System.out.println(resultado);
    }
    
}