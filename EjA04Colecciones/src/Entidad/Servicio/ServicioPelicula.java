package Entidad.Servicio;

import Entidad.Pelicula;
import eja04colecciones.newpackage.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Pelicula> Cine = new ArrayList();
    
    
    public Pelicula IngresarPelicula() {
        Pelicula d1 = new Pelicula();
        System.out.println("Ingrese el nombre de la Pelicula: ");
        d1.setPelicula(leer.next());
        d1.setPelicula(d1.getPelicula().substring(0,1).toUpperCase().concat(d1.getPelicula().substring(1).toLowerCase()));
        System.out.println("Ingrese el Director de la Pelicula: ");
        d1.setDirector(leer.next());
        d1.setDirector(d1.getDirector().substring(0,1).toUpperCase().concat(d1.getDirector().substring(1).toLowerCase()));
        System.out.println("Ingrese la Duracion de la Pelicula, en horas: ");
        d1.setDuracion(leer.nextDouble());
        return new Pelicula(d1.getPelicula(),d1.getDirector(),d1.getDuracion());
    }

    public void Peliculas() {
        String opcion;
        do {
            Cine.add(IngresarPelicula());
            System.out.println("Desea ingresar otra Pelicula? (S/N)");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("N"));
    }

    public void MostrarPeliculas() {
      if(Cine.isEmpty()){
            System.out.println("No hay ninguna peli cargada...");
       }else{
        for (Pelicula aux : Cine) {
            System.out.println(aux.toString());
        }
       }
    }

    public void PeliculasMas1Hora() {
        System.out.println(" ");
        System.out.println("Peliculas + de 1 hr.");
        System.out.println("--------------------");
        for (Pelicula aux : Cine) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux.toString());
            }
        }
    }

    public void PeliculasMayoraMenor() {
        System.out.println(" ");
        System.out.println("Peliculas de mayor a menor duracion.");
        System.out.println("------------------------------------");
        Collections.sort(Cine, Comparadores.OPDuracionA);
        MostrarPeliculas();
    }

    public void PeliculasMenoraMayor() {
        System.out.println(" ");
        System.out.println("Peliculas de menor a mayor duracion.");
        System.out.println("------------------------------------");
        Collections.sort(Cine, Comparadores.OPDuracionD);
        MostrarPeliculas();
    }

    public void PeliculasTitulo() {
        System.out.println(" ");
        System.out.println("Peliculas ordenadas por Titulo.");
        System.out.println("-------------------------------");
        Collections.sort(Cine, Comparadores.OPTitulo);
        MostrarPeliculas();
    }

    public void PeliculasDirector() {
        System.out.println(" ");
        System.out.println("Peliculas ordenadas por Director");
        System.out.println("--------------------------------");
        Collections.sort(Cine, Comparadores.OPDirector);
        MostrarPeliculas();
    }

    public void Menu() {
        int opcion;
        do {
            System.out.println("Menu de Opciones");
            System.out.println("----------------");
            System.out.println("1- Ingresar Pelis.");
            System.out.println("2- Mostar Pelis.");
            System.out.println("3- Pelis + de 1 hr.");
            System.out.println("4- Pelis duracion mayor a menor.");
            System.out.println("5- Pelis duracion menor a mayor.");
            System.out.println("6- Pelis orden por Titulo.");
            System.out.println("7- Pelis orden por Director.");
            System.out.println("8- Salir");
            System.out.println("Ingrese su opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Peliculas();
                    continue;
                case 2:
                    MostrarPeliculas();
                    continue;
                case 3:
                    PeliculasMas1Hora();
                    continue;
                case 4:
                    PeliculasMayoraMenor();
                    continue;
                case 5:
                    PeliculasMenoraMayor();
                    continue;
                case 6:
                    PeliculasTitulo();
                    continue;
                case 7:
                    PeliculasDirector();
                    continue;
                case 8:
                    System.out.println("Programa Finalizado... Adios...");
                    break;
                default:
                    System.out.println("Opcion inexistente, ingrese nuevamente...");
                    opcion = leer.nextInt();
            }
        } while (opcion != 8);
    }
}
