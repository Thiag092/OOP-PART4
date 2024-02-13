


/**
 * Abstraccion de un Laboratorio al cual se le solicita diferentes datos
 * para su posterior publicacion.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */

public class Laboratorio {
        //Definicion de atributos;-------------------------------------------

    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Constructor de la clase Laboratorio.
     * 
     * @param: p_nombre: Nombre del laboratorio.
     * @param: p_domicilio: Domicilio del establecimiento.
     * @param: p_telefono: numero de telefono de contacto.
     * @param: p_compaMinima: minimo de pedido que se peude realizar.
     * @param:p_diaDeEntrega: fecha estimada de entrega del pedido.
     * 
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega){
       
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraminima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }
    
    /**
     * 2do Constructor de la clase Laboratorio.
     * 
     * @param: p_nombre: Nombre del laboratorio.
     * @param: p_domicilio: Domicilio del establecimiento.
     * @param: p_telefono: numero de telefono de contacto.
     * @param: p_compaMinima: minimo de pedido que se peude realizar(valor ya deifnido).
     * @param:p_diaDeEntrega: fecha estimada de entrega del pedido.(valor ya deifnido)
     * 
     */
     public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraminima(0);
        this.setDiaEntrega(0);
    }
    
    
    //Metodos Set-----------------------------------------------------------------------------
    /**
     * @param: p_nombre: Nombre del laboratorio.
     */
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    /**
     * @param:  p_domicilio: Domicilio del establecimiento.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio=p_domicilio;
    }
    
    /**
     * @param: p_telefono: numero de telefono de contacto.
     */
    private void setTelefono(String p_telefono){
        this.telefono=p_telefono;
    }
    
    /**
     * @param: p_compaMinima: minimo de pedido que se peude realizar
     */
    private void setCompraminima(int p_compraMinima){
        this.compraMinima=p_compraMinima;
    }
    
    /**
     * @param: p_diaDeEntrega: fecha estimada de entrega del pedido
     */
    private void setDiaEntrega(int p_diaEntrega){
        this.diaEntrega=p_diaEntrega;
    }
    
    //Metodos get-------------------------------------------------------------------------------------------------
    /**
     *  @return: Devuelve el nombre de la entidad de tipo String
     */
    public String getNombre(){
        return this.nombre;
    }
    
     /**
     *  @return:Devuelve el domicilio de la institucion de tipo String
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
     /**
     *  @return:Devuelve el telefono de contacto de tipo Stirng
     */
    public String getTelefono(){
        return this.telefono;
    }
    
     /**
     *  @return:Devuelve la compra minima de ipo int
     */
    public int getCompraMinima(){
        return this.compraMinima;
    }
    
     /**
     *  @return:Devuelve el dia de entrega del pedido
     */
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
     /**
     *  @param: p_compraminima: Modifica el valor dela compra minima pre establecida
     */
    public void NuevaCompraMinima(int p_compraminima){
        compraMinima=p_compraminima;
    }
    
     /**
     *  Modifica el calro del dia de entrega del pedido
     */
    public void NuevoDiaEntrega(int p_diaEntrega){
        
        diaEntrega=p_diaEntrega;
    }
    
     /**
     *  Imprime los datos solicitados tales como el nombre, domicilio y telefono
     *  de la entidad.
     */
    public void Mostrar(){
        System.out.println("Laboratorio: " +getNombre());
        System.out.println("Domicilio: " +getDomicilio());
        System.out.println("Telefono: "+getTelefono());
    }
}