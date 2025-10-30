
package Punto4_TarjetaDeCredito;

public class Punto4_TarjetaDeCredito {
    public static void main(String[] args) {
    Banco banco1 = new Banco ("Santo Bancander", "20-12345678-9");
    
    TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("123412341234", "20/02/2030", null, banco1);
    
    Cliente cliente1 = new Cliente("Pedro Pascal", "1234546778", tarjeta1);
    
        System.out.println(cliente1);
        
    }
}
    




 