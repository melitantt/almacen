
package almacen;


public class BebidaAzucarada extends Bebidas {
    private float porcentajeAzucar;
    private boolean promocion;
    
    public BebidaAzucarada(float porcentajeAzucar, boolean promocion, int id, float cantidad, float precio, String marca) {
        super(id, cantidad, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    public void setPorcentajeAzucar(float porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    public float getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }
    
}
