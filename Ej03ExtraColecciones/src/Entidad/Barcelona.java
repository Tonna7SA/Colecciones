package Entidad;
/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Barcelona {
public String nombre;
public String apellido;

    public Barcelona() {
    }

    public Barcelona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Barcelona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
