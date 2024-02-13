import java.util.Scanner;
import java.util.*;
/**
 * Clase ejecutable la cual se encarga de agregar los datos tendientes al la lsita del pedido, los prducstos
 * que lo integran, para su psoteriro manejo y publicacion para despacharse
 */
public class TomaPedido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar fechaHoy = new GregorianCalendar();
        Cliente cliente1 = new Cliente(1122, "Yago", "Ayala", 0);
        Laboratorio laboratorio1 = new Laboratorio("Colgate", "Junin 200", "223455", 100, 15);

        Pedido unPedido = new Pedido(fechaHoy, cliente1, new ArrayList<>());
        Producto ultimoProducto=null;
        while (true) {
            System.out.println("\n--------------------------------------------");
            System.out.println("\nFaavor de elegir una opcion");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Quitar un producto");
            System.out.println("3. Salir");
            System.out.println("\n--------------------------------------------");
            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el código del producto: ");
                    int codigo1 = teclado.nextInt();
                    teclado.nextLine(); 
                    System.out.print("Ingrese la rubro del producto: ");
                    String rubro1 = teclado.nextLine();

                    System.out.print("Ingrese la descripción del producto: ");
                    String descripcion1 = teclado.nextLine();

                    System.out.print("Ingrese el costo: ");
                    double costo1 = teclado.nextDouble();

                    System.out.print("Ingrese porcPtoRepo: ");
                    double porcPtoRepo1 = teclado.nextDouble();

                    System.out.print("Ingrese la cantidad en stock: ");
                    int stock1 = teclado.nextInt();

                    System.out.print("Ingrese la cantidad mínima requerida: ");
                    int cantidadMinima1 = teclado.nextInt();

                    Producto producto1 = new Producto(codigo1, rubro1, descripcion1, costo1, stock1, porcPtoRepo1, cantidadMinima1, laboratorio1);
                    unPedido.AgregarProducto(producto1);
                    
                    ultimoProducto=producto1;
                    System.out.println("\nProducto agregado con éxito.");
                    unPedido.MostrarPedido();
                    System.out.println("\n--------------------------------------------");
                    break;

                

                case 2:
                    
                            unPedido.QuitarProducto(ultimoProducto);
                            unPedido.MostrarPedido();
                            System.out.println("\nProducto eliminado con éxito.");
                            System.out.println("\n--------------------------------------------");
                            break; 
                        

                case 3:
                    System.out.println("\n****GRACIAS POR USAR EL SERVICIO****");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n----Opcion incorrecta, ingrese nuevamente----");
                    break;
            }
        }
    }
}
