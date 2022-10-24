package ej03maocolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Tonna/SA FR34K
 */
/**/
public class Ej03MAOColecciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // EJERCICIO COLECCIONES
        //Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
        //cada forma que aprendiste arriba.
        
         ArrayList <Integer> numeros = new ArrayList <>();
        HashSet<Integer> numeros1 = new HashSet();
        HashMap<Integer,String> personas = new HashMap<>();
        int a=1;
        int b=2;
        int c=3;
        numeros.add(10);
        numeros.add(20);
        numeros.add(a);
        numeros.add(b);
        numeros.add(c);
        
        numeros.remove(a);
        numeros.remove(10);
        
        numeros1.add(a);
        numeros1.add(b);
        numeros1.add(c);
        numeros1.add(11);
        numeros1.add(21);
        
        numeros1.remove(a);
        numeros1.remove(21);
        
        
        String x="Gonzalo";
        String y="Jesus";
        String z="Eduardo";
        
        personas.put(a, x);
        personas.put(b, y);
        personas.put(c, z);
        personas.put(4, "Tristan");
        personas.put(5, "Cristina");
        
        personas.remove(a);
        personas.remove(4, "Tristan");

    }

}
