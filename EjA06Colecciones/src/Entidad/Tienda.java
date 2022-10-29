package Entidad;
/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Tienda {
public String Producto;
public Double Precio;

    public Tienda() {
    }

    public Tienda(String Producto, Double Precio) {
        this.Producto = Producto;
        this.Precio = Precio;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "Producto=" + Producto + ", Precio=" + Precio + '}';
    }

}
