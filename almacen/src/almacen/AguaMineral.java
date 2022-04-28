
package almacen;


public class AguaMineral extends Bebidas {
    String origen;
    

    public AguaMineral(String origen, int id, float cantidad, float precio, String marca) {
        super(id, cantidad, precio, marca);
        this.origen = origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }
    
}
