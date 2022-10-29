package Entidad.Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> Almacen = new HashMap<>();
    Tienda d1 = new Tienda();

    public void IngresarProductos() {
        String opcion;
        do {
            System.out.println("Ingrese el nombre del Producto: ");
            d1.setProducto(leer.next());
            System.out.println("Ingrese el precio del Producto: ");
            d1.setPrecio(leer.nextDouble());
            Almacen.put(d1.getProducto(), d1.getPrecio());
            System.out.println("Desea ingresar otro Producto...(S/N)");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void MostrarProductos() {

        for (Map.Entry<String, Double> entry : Almacen.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " ---- Precio: $ " + entry.getValue());
        }
    }

    public void ModificarPrecio() {

        String opcion;
        do {
            System.out.println("Ingrese el Producto, para modificar su precio: ");
            String producto = leer.next();
            int a = 0;
            for (Map.Entry<String, Double> entry : Almacen.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(producto)) {
                    System.out.println("Producto encontrado");
                    System.out.println("Ingrese el nuevo precio del producto " + producto);
                    entry.setValue(leer.nextDouble());
                    System.out.println("Producto Modificado....");
                    a = 1;
                }
            }
            if (a == 0) {
                System.out.println("Ese producto no se encuentra en la lista");
            }
            System.out.println("Desea cambiar otro Producto...(S/N)");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void EliminarProducto() {
        String opcion;
        do {
            System.out.println("Ingrese el Producto, que desea eliminar ");
            String producto = leer.next();
            int a = 0;
            for (Map.Entry<String, Double> entry : Almacen.entrySet()) {
                if (entry.getKey()!=null && entry.getKey().equals(producto)) {
                    System.out.println("Producto encontrado");
                    Almacen.remove(entry.getKey());
                    System.out.println("Producto Eliminado....");
                    a = 1;
                    break;
                }
            }
            if (a == 0) {
                System.out.println("Ese producto no se encuentra en la lista");
            }
            System.out.println("Desea eliminar otro Producto...(S/N)");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));

    }

    public void Menu() {
        int opcion;
        do {
            System.out.println("");
            System.out.println("Menu de Almacen");
            System.out.println("1- Ingresar Producto y Precio");
            System.out.println("2- Mostar Lista de Productos y Precios");
            System.out.println("3- Modificar precio de un Producto");
            System.out.println("4- Eliminar Producto de la lista");
            System.out.println("5- Salir");
            System.out.println("Ingrese su opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    IngresarProductos();
                    continue;
                case 2:
                    if (Almacen.isEmpty()) {
                        System.out.println("Lista Vacia... ingrese algun producto...");
                    } else {
                        MostrarProductos();
                    }
                    continue;
                case 3:
                    if (Almacen.isEmpty()) {
                        System.out.println("Lista Vacia... ingrese algun producto...");
                    } else {
                        ModificarPrecio();
                    }
                    continue;
                case 4:
                    if (Almacen.isEmpty()) {
                        System.out.println("Lista Vacia... ingrese algun producto...");
                    } else {
                        EliminarProducto();
                    }
                    continue;
                case 5:
                    System.out.println("Programa Finalizado... Chau...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida... intente nuevamente... ");
                    System.out.println("");
            }
        } while (opcion != 5);
    }
}
