package Entidad.Servicio;

import Entidad.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioPaises {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TreeSet<String> P = new TreeSet<>();
    Paises d1 = new Paises();

    public void Pais() {
        String opcion;
        do {
            System.out.println("Ingrese un pais: ");
            d1.setPais(leer.next());
            P.add(d1.getPais());
            System.out.println("Desea ingresar otro pais... (S/N)");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void MostrarPaises() {
        for (String aux : P) {
            System.out.println(aux);
        }
    }
    Iterator <String> recorrer;
    public void BorrarPais(){
        int a=0;
        System.out.println("Ingrese el pais que desea borrar: ");
        String busca=leer.next();
        recorrer = P.iterator();
        while(recorrer.hasNext()){
            if(recorrer.next().equals(busca)){
                recorrer.remove();
                a=1;
            }
        }
        if(a==1){
            System.out.println("El pais ha sido encontrado y eliminado...");
            for (String aux : P) {
                System.out.println(aux);
            }
        }else{
            System.out.println("El pais no ha sido encontrado...");
        }
    }

}
