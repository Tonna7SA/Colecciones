package eja04colecciones.newpackage;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Comparadores {

    public static Comparator<Pelicula> OPDuracionA = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    public static Comparator<Pelicula> OPDuracionD = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
     public static Comparator<Pelicula> OPTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getPelicula().compareTo(t1.getPelicula());
        }
    };
      public static Comparator<Pelicula> OPDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
