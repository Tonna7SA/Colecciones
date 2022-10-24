package ej06maocolecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tonna/SA FR34K
 */
/**/
public class Ej06MAOColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //        EJERCICIO LISTA LIBROS
        //¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> libros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el titulo del libro");
            libros.add(leer.next());
        }
        for (String titulo : libros) {
            System.out.println(titulo);
        }
    }


}
