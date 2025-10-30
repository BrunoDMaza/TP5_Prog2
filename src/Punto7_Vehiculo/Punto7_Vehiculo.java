
package Punto7_Vehiculo;


public class Punto7_Vehiculo {
    public static void main (String[] args) {
        System.out.println("=== Ejemplo 1: Creación completa ===");
        
        // Crear motor
        Motor motor1 = new Motor("V8", 123456);
        
        // Crear conductor sin vehículo
        Conductor conductor1 = new Conductor("Juan Pérez", "B2345678", null);
        
        // Crear vehículo
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Ford Mustang", motor1, conductor1);
        
        // Establecer relación bidireccional
        conductor1.setVehiculo(vehiculo1);
        
        // Mostrar información
        System.out.println(vehiculo1);
        System.out.println(conductor1);
        System.out.println(motor1);
        
        System.out.println("\n=== Ejemplo 2: Cambiar conductor ===");
        
        // Crear otro conductor
        Conductor conductor2 = new Conductor("María García", "A9876543", null);
        
        // Cambiar conductor del vehículo
        vehiculo1.setConductor(conductor2);
        
        System.out.println("Nuevo conductor del vehículo: " + vehiculo1.getConductor().getNombre());
        System.out.println("Vehículo del nuevo conductor: " + conductor2.getVehiculo().getPatente());
        
        System.out.println("\n=== Ejemplo 3: Crear vehículo nuevo ===");
        
        Motor motor2 = new Motor("V6", 789012);
        Conductor conductor3 = new Conductor("Carlos López", "C1122334", null);
        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "Toyota Corolla", motor2, conductor3);
        conductor3.setVehiculo(vehiculo2);
        
        System.out.println(vehiculo2);
        System.out.println(conductor3);
        
        System.out.println("\n=== Ejemplo 4: Cambiar motor (Agregación) ===");
        
        Motor motor3 = new Motor("V12", 555666);
        System.out.println("Motor anterior: " + vehiculo1.getMotor());
        vehiculo1.setMotor(motor3);
        System.out.println("Motor nuevo: " + vehiculo1.getMotor());
        System.out.println("Motor anterior sigue existiendo: " + motor1);
    }
}

