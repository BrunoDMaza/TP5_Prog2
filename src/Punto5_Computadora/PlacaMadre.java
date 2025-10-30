
package Punto5_Computadora;


public class PlacaMadre {
    private String modelos;
    private String chipset;

    public PlacaMadre(String modelos, String chipset) {
        this.modelos = modelos;
        this.chipset = chipset;
    }

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelos=" + modelos + ", chipset=" + chipset + '}';
    }
    
    
}
