
package Punto2_Celular;


public class Punto2_Celular {
     public static void main(String[] args) {
        Bateria bateria1 = new Bateria("Litio", 100.0);
        Usuario usuario1 = new Usuario("Juan Salvo", "33232565");
        
        Celular celular1 = new Celular ("A123B345", "Nokia", "1100", bateria1, usuario1);
        
        
        
        celular1.setUsuario(usuario1);
        
         System.out.println(celular1);
    }
}
