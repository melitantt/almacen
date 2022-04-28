
package almacen;

public class Bebidas {
    
    private int id;
    private float cantidad;
    private float precio;
    private String marca;
    
    public Bebidas(int id, float cantidad, float precio, String marca){
        this.id = id;
        this.cantidad = cantidad;
        this.marca = marca;
        this.precio = precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public float getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }
    
 



}
