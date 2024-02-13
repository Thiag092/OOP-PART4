 import java.util.*;
import java.util.ArrayList;

/**
 *Amstraccion de un pedido realizado por un cliente determinado de una empresa, donse se solicitan una variedad
 *de datos necesarios para su manejo por parte de la organizacion.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedido
{
     private Cliente cliente;
    private ArrayList<Producto> productos;
    private Calendar fecha;
    
    /**
     * Constructor de la clase Pedido
     * @param:p_fecha fecha de ingreso del pedido al sistema
     * @param:p_cliente: Cliente encargado de realizar el pedido
     * @param:p_productos: lista de productos en una coleccion estatica para su psotrior despacho
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos){
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
        this.setFecha(p_fecha);
        
    }
    
    /**
     * Constructor de la clase Pedido
     * @param:p_fecha fecha de ingreso del pedido al sistema
     * @param:p_cliente: Cliente encargado de realizar el pedido
     * @param:p_producto: producto especifico que se agrego al pedido
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        
        this.setProductos(new ArrayList<Producto>());
        this.AgregarProducto(p_producto);
    }
    
    //Definimos los setters----------------------
    
    /**
     * @param: p_fecha: fecha de ingreso del pedido al sistema
     */
    public void setFecha(Calendar p_fecha){
        this.fecha=p_fecha;
    }
    /**
     * @param:p_cliente: Cliente encargado de realizar el pedido
     * 
     */
    public void setCliente(Cliente p_cliente){
            this.cliente=p_cliente;
    }
    /**
     * @param: p_productos: lista de productos en una coleccion estatica para su psotrior despacho
     */
    public void setProductos(ArrayList<Producto> p_productos){
            this.productos=p_productos;
    }
    
   
    
    
    //Definimos los Getteres-----------------------------
    /**
     * @return: retorna la fecha del pedido
     */
    public Calendar getFecha(){
        return this.fecha;
    }
    /**
     * @return: retorna le cliente encargado del pedido que entro al sistema
     */
    public Cliente getCliente(){
        return this.cliente;
    }
    
    /**
     * @return: retorna la lista compelta dle pedido realizado por el cliente
     */
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }
    
    
    /**
     * @return: Devuelve  el resultado de calcular la suma del precio de contado de cada elemento de la lista
     */
    public double TotalAlContado(){
            double totalContado=0;
        for(Producto unProducto: this.getProductos()){
            totalContado+=unProducto.precioContado();
        }
        return totalContado;
    }
    
    /**
     * @return: la suma del precio de lista de cada elemento de la colección de productos solicitados.�
     */
    public double TotalFinanciado(){
        double totalFinanciado=0;
        for(Producto unProducto: this.getProductos()){
            totalFinanciado+=unProducto.precioLista();
        }
        return totalFinanciado;
    }
    
    /**
     * Metodo encargado de agregar un producto a la lista del pedido
     */
    public boolean AgregarProducto(Producto p_producto){
       return this.getProductos().add(p_producto);
    }
    /**
     * Metodo encargado de quitar un producto de la llista de pedidos
     */
    public boolean QuitarProducto(Producto p_producto){
        return this.getProductos().remove(p_producto);
    }
    
    /**
     * Metodo que se encarga de imprimir la informacion total del pedido tales como los productos
     * del pedido, el precio total, y datos dlecliente
     */
    public void MostrarPedido(){
        System.out.println("\n**** Detalle del pedido**** Fecha: "
        +this.getFecha().get(Calendar.DAY_OF_MONTH)+" dias, del mes "+(this.getFecha().get(Calendar.MONTH)+1)+", del año "+this.getFecha().get(Calendar.YEAR));
        
        System.out.println("Producto        Precio lista        Precio Contado");
        System.out.println("-----------------------------------------------------");
        for(Producto unProducto: this.getProductos()){
            System.out.println(unProducto.getDescripcion()+"        "+unProducto.precioLista()+"        "+unProducto.precioContado());
                    
        }
         System.out.println("-----------------------------------------------------");
         
         System.out.println("Total:         "+this.TotalFinanciado()+"          "+this.TotalAlContado());

        
    }
}
