package Entidad.Servicio;

import Entidad.Barcelona;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioBarcelona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TreeSet<String> lista = new TreeSet<>();
    TreeSet<String> listanueva = new TreeSet<>();

    Barcelona d1 = new Barcelona();

    public void IngresoJugador() {
        int opcion;
        String opcion1;
        do {
            System.out.println("Datos Jugador");
            System.out.println("-------------");
            System.out.println("Ingrese el nombre:");
            String nombre = leer.next();
            nombre = nombre.substring(0, 1).toUpperCase().concat(nombre.substring(1).toLowerCase());
            d1.setNombre(nombre);
            System.out.println("Ingrese el apellido:");
            String apellido = leer.next();
            apellido = apellido.substring(0, 1).toUpperCase().concat(apellido.substring(1).toLowerCase());
            d1.setApellido(apellido);
            System.out.println(d1.getNombre() + " " + d1.getApellido());
            lista.add(d1.getNombre() + " " + d1.getApellido());
            System.out.println("Desea ingreasar otro jugador?? (S/N)");
            opcion1 = leer.next();

        } while (opcion1.equalsIgnoreCase("S"));
    }

    public void Mostrar() {
        for (String aux : lista) {
            System.out.println(aux);
        }
    }

    public void Buscar() {
        int a = 0;
        System.out.println("Buscar Jugador");
        System.out.println("--------------");
        System.out.println("Ingrese el nombre:");
        String nombre = leer.next();
        nombre = nombre.substring(0, 1).toUpperCase().concat(nombre.substring(1).toLowerCase());
        System.out.println("Ingrese el apellido:");
        String apellido = leer.next();
        apellido = apellido.substring(0, 1).toUpperCase().concat(apellido.substring(1).toLowerCase());
        for (String aux : lista) {
            if (aux.contains(nombre + " " + apellido)) {
                System.out.println("Jugador encontrado");
                a = 1;
            }
        }
        if (a == 0) {
            System.out.println("El jugador no esta en la lista");
        }
    }

    public void NuevosJugadores() {
        listanueva.add("Gerard Pique");
        listanueva.add("Sergio Busquets");
    }

    public void AgregarJugador() {
        int a = 0;
        for (String aux : lista) {
            if (aux.contains(listanueva.toString())) {
                System.out.println("Los jugadores estan en la lista");
                a = 1;
            }
        }
        if (a == 0) {
            Iterator<String> recorrer = listanueva.iterator();
            while (recorrer.hasNext()) {
                lista.add(recorrer.next());
                recorrer.remove();
            }
        }
        System.out.println("Los jugadores de la lista 2, se agregaran a la lista original...");
        System.out.println("La cantidad de jugadores de la lista nueva, es: " + listanueva.size());
        System.out.println("");
        System.out.println("Lista Original");
        Mostrar();
    }
}
