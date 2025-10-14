/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1_Pasaporte;

/**
 *
 * @author bruno
 */
public class Punto1_Pasaporte {
     public static void main(String[] args) {
         Pasaporte pasaporte1 = new Pasaporte("A1234567", "2025-10-14", "fotoBruno.png", "png");
         
         Titular titular1 = new Titular("Bruno Maza", "12345678");
         
         pasaporte1.setTitular(titular1);
         
         System.out.println(pasaporte1);
         System.out.println(titular1);
         
         
        
    }
}
