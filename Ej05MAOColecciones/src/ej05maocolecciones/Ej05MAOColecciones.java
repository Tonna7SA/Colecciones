package ej05maocolecciones;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Tonna/SA FR34K
 */
/**/
public class Ej05MAOColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //        MANOS A LA OBRA - DETECCIÓN DE ERRORES 03
        //ArrayList<String> = new ArrayList()
        //bebidas.put(“café);
        //bebidas.add(“té”);
        //Iterator<String> it =bebidas.iterator();
        //whale (it.next()){
        //if (it.next().equals(“café”)){
        //it.remove();
        //}
        
        ArrayList<String> bebidas = new ArrayList<>();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
    }
}
