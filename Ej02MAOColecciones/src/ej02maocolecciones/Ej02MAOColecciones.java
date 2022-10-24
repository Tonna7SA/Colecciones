package ej02maocolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Tonna/SA FR34K
 */
/**/
public class Ej02MAOColecciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // EJERCICIO COLECCIONES
        //Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.

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
        
        numeros1.add(a);
        numeros1.add(b);
        numeros1.add(c);
        numeros1.add(11);
        numeros1.add(21);
        
        String x="Gonzalo";
        String y="Jesus";
        String z="Eduardo";
        
        personas.put(a, x);
        personas.put(b, y);
        personas.put(c, z);
        personas.put(4, "Tristan");
        personas.put(5, "Cristina");
        
    }

}
