package Entidad;


/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Paises{ 

    public String Pais;

    public Paises() {
    }

    public Paises(String Pais) {
        this.Pais = Pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public String toString() {
        return "Paises{" + "Pais=" + Pais + '}';
    }
    
}
