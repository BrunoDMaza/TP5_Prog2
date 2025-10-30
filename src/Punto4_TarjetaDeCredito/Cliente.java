
package Punto4_TarjetaDeCredito;


public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, String dni, TarjetaDeCredito tarjetaDeCredito) {
        this.nombre = nombre;
        this.dni = dni;
        setTarjetaDeCredito(tarjetaDeCredito);
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

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente()!= this) {
            tarjetaDeCredito.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni +   ", tarjetaDeCredito=" + (tarjetaDeCredito != null ? tarjetaDeCredito.getNumero() : "null") + '}';
    }
    
    
    
}
