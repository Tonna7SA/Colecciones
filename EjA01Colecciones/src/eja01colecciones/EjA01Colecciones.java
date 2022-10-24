package eja01colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tonna/SA FR34K
 */
/*1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
public class EjA01Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perros = new ArrayList<>();
        String opcion;
        do {
                System.out.println("Ingrese la raza del perro");
                perros.add(leer.next());
                System.out.println("Desea ingresar otra raza de perro (S/N)");
                opcion = leer.next();
        } while (opcion.equalsIgnoreCase("s"));
        System.out.println("Lista de Razas de perros");
        for (String aux : perros) {
            System.out.println(aux);
        }
        System.out.println("La cantidad de perros de la lista es: "+perros.size());
    }

}
