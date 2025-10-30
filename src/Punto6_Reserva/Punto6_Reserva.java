
package Punto6_Reserva;


public class Punto6_Reserva {
    public static void main (String[] args){
        // Ejemplo 1: Reserva para 2 personas
        System.out.println("=== Ejemplo 1: Reserva simple ===");
        Cliente cliente1 = new Cliente("María González", 1545678901);
        Mesa mesa1 = new Mesa(5, 2);
        Reserva reserva1 = new Reserva("2024-11-15", "20:00", cliente1, mesa1);
        
        System.out.println(reserva1);
        System.out.println();
        
        // Ejemplo 2: Cambio de mesa (demuestra agregación)
        System.out.println("=== Ejemplo 2: Cambio de mesa ===");
        Cliente cliente2 = new Cliente("Juan Pérez", 1198765432);
        Mesa mesa2 = new Mesa(10, 4);
        Reserva reserva2 = new Reserva("2024-11-20", "21:00", cliente2, mesa2);
        
        System.out.println("Reserva original:");
        System.out.println(reserva2);
        
        Mesa mesaNueva = new Mesa(8, 4);
        reserva2.setMesa(mesaNueva);
        
        System.out.println("\nReserva con mesa cambiada:");
        System.out.println(reserva2);
        System.out.println("\nLa mesa anterior sigue existiendo: " + mesa2);
    }
}

