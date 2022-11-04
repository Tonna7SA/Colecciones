package ej03extracolecciones;

import Entidad.Servicio.ServicioBarcelona;

/**
 * @author Tonna/SA FR34K
 */
/*Ejercicio3(utilizar Set) 
Crea un conjunto al que se le va a llamar jugadores. Inserta en el conjunto los jugadores del FC Barcelona.
Realiza un bucle sobre los jugadores del conjunto y muestra sus nombres.
Consulta si en el conjunto existe el jugador «Neymar JR». Avisa si existe o no.
Crea un segundo conjunto jugadores2 con los jugadores «Piqué» y «Busquets».
Consulta si todos los elementos de jugadores2 existen en jugadores.
Realiza una unión de los conjuntos jugadores y jugadores2.
Elimina todos los jugadores del conjunto jugadores2 y muestra el número de jugadores que tiene el conjunto jugadores2 (debería ahora ser cero)
	
Víctor Valdés  Portero
Oier Olazábal 	Portero
José Manuel Pinto 	Portero
Gerard Piqué 	Defensa central
Marc Bartra 	Defensa central
Carles Puyol 	Defensa central
Sergi Gómez 	Defensa central
Patric Patric	Defensa central
Jordi Alba 	Lateral izquierdo
Adriano Adriano      Lateral izquierdo
Dani Alves 	Lateral derecho
Martín Montoya 	Lateral derecho
Sergi Roberto 	SergiLateral derecho
Sergio Busquets 	Pivote
Alex Song 	Pivote
Javier Mascherano 	Pivote
Andrés Iniesta          Mediocentro
Cesc Fàbregas 	Mediocentro
Xavi    Xavi               Mediocentro
Jonathan dos Santos  Mediocentro
Ibrahim Afellay 	Mediocentro ofensivo
Neymar 	Neymar Extremo izquierdo
Cristian Tello 	Extremo izquierdo
Isaac Cuenca 	Extremo izquierdo
Pedro 	Pedro Extremo derecho
Adama Traoré 	Extremo derecho
Lionel Messi 	Mediapunta
Alexis Sánchez 	Delantero centro
Jean Marie Dongou  Delantero centro 
 */
public class Ej03ExtraColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioBarcelona datos = new ServicioBarcelona();
        datos.IngresoJugador();
        datos.Mostrar();
        datos.Buscar();
        datos.NuevosJugadores();
        datos.AgregarJugador();
    }

}
