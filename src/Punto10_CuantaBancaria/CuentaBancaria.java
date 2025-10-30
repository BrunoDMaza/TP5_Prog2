
package Punto10_CuantaBancaria;


public class CuentaBancaria {
    private int cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(int cbu, double saldo, String codigo, String ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad (codigo, ultimaModificacion);
        setTitular(titular);
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
            }
        }
    
    @Override
public String toString() {
    return "CuentaBancaria{" + 
           "cbu=" + cbu + 
           ", saldo=" + saldo + 
           ", claveSeguridad=" + claveSeguridad + 
           ", titular=" + (titular != null ? titular.getNombre() : "null") +  // ✓ Solo el nombre
           '}';
}
}

    
    
    

