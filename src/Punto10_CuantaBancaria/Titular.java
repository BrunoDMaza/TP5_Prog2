
package Punto10_CuantaBancaria;


public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.dni = dni;
        setCuentaBancaria(cuentaBancaria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this){
            cuentaBancaria.setTitular(this);
            }
    }

    @Override
public String toString() {
    return "Titular{" + 
           "nombre=" + nombre + 
           ", dni=" + dni + 
           ", cuentaBancaria=" + (cuentaBancaria != null ? cuentaBancaria.getCbu() : "null") +  // ✓ Solo el CBU
           '}';
}
    
    
    
}
