
package Punto10_CuantaBancaria;


public class Punto10_CuentaBancaria {
    public static void main(String[] args) {
            // 1. Crear el Titular sin cuenta (null)
        Titular titular1 = new Titular("Juan Pérez", "12345678", null);
        
        // 2. Crear la CuentaBancaria con el titular (automáticamente se vinculan)
        CuentaBancaria cuenta1 = new CuentaBancaria(
            123456789,           // cbu
            5000.50,             // saldo
            "ABC123",            // codigo de clave
            "2025-10-29",        // ultimaModificacion
            titular1             // titular
        );
        
        // Verificar la relación bidireccional
        System.out.println(cuenta1);
        System.out.println("\n" + titular1);
        System.out.println("\nTitular de la cuenta: " + cuenta1.getTitular().getNombre());
        System.out.println("Cuenta del titular: " + titular1.getCuentaBancaria().getCbu());
        
    }
}
