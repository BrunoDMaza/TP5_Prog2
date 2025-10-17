
package Punto3_Libro;



public class Punto3_Libro {
     public static void main(String[] args) {
         Autor autor1 = new Autor ("Gabriel Garcia Marquez", "Colombiana");
         
         Editorial editorial1 = new Editorial ("Sudamericana", "Bs As");
         
         Libro libro1 = new Libro ("Cien años de soledad", "789456123", autor1, editorial1);
         
         System.out.println(libro1);
         
         System.out.println("Autor " + libro1.getAutor().getNombre());
         System.out.println("Nacionalidad " + libro1.getAutor().getNacionalidad());
         
         System.out.println("Nombre de la editorial " + libro1.getEditorial().getNombre());
         System.out.println("Dirección " + libro1.getEditorial().getDireccion());
    }
}
