package Entidad;

import java.util.Objects;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Pelicula {

    public String Pelicula;
    public String Director;
    public Double Duracion;

    public Pelicula() {
    }

    public Pelicula(String Pelicula, String Director, Double Duracion) {
        this.Pelicula = Pelicula;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.Pelicula);
        hash = 17 * hash + Objects.hashCode(this.Director);
        hash = 17 * hash + Objects.hashCode(this.Duracion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.Pelicula, other.Pelicula)) {
            return false;
        }
        if (!Objects.equals(this.Director, other.Director)) {
            return false;
        }
        if (!Objects.equals(this.Duracion, other.Duracion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cine{" + "Pelicula= " + Pelicula + ", Director= " + Director + ", Duracion= " + Duracion + " hrs." +'}';
    }

}
