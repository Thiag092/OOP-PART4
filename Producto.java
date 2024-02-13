import java.util.Scanner;

/**
 * Abstraccion de un producto al cual se le solicita diferentes datos
 * para su posterior publicacion y manejo
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Producto

{
        //Definicion de atributos;-------------------------------------------

    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    /**
     * @param: p_codigo: Codigo de identificacion del producto
     */
   private void setCodigo(int p_codigo){
       this.codigo=p_codigo;
   }
    
   /**
     * @param: p_rubro:rubro de pertenencia del producto
     */
   private void setRubro(String p_rubro){
       this.rubro=p_rubro;
   }
   
   /**
     * @param: p_descripcion:Descripciond le producto
     */
   private void setDescripcion(String p_descripcion){
       this.descripcion=p_descripcion;
   }
   
   /**
     * @param: p_costo: valor de costo del producto
     */
   private void setCosto(double p_costo){
       this.costo=p_costo;
   }
   
   /**
     * @param: p_stock: stock disponible dle producto
     */
   private void setStock(int p_stock){
       this.stock=p_stock;
   }
   
   /**
     * @param: p_porc: punto de reposicion del producto
     */
   private void setPorcPtoRepo(double p_porc){
       this.porcPtoRepo=p_porc;
   }
   
   /**
     * @param: p_existMinima: ecistencia minima aceptada dle producto
     */
   private void setExistMinima(int p_existMinima){
       this.existMinima=p_existMinima;
   }
   
   /**
     * @param: p_laboratorio:Laboratorio fabricante del producto
     */
   private void setLaboratorio(Laboratorio p_laboratorio){
     this.laboratorio = p_laboratorio; 
    }
   
    //   Metodos Getteres ------------------------------------------------------------------------------
    
   /**
     * @return: codigo del producto de tipo int
     */
   public int getCodigo(){
    return this.codigo;
    }
    
    /**
     * @return: devuelve rubro  del producto de tipo String
     */
    public String getRubro(){
    return this.rubro;
    }
    
     /**
     * @return: devuelve Descripcion  del producto de tipo String
     */
    public String getDescripcion(){
    return this.descripcion;
    }
    
     /**
     * @return: devuelve valor de costo  del producto de tipo double
     */
    public double getCosto(){
    return this.costo;
    }
    
     /**
     * @return: devuelve stock  del producto de tipo int
     */
    public int getStock(){
    return stock;
    }
    
     /**
     * @return: devuelve punto de reposicion  del producto de tipo double
     */
    public double getPorcPtoRepo(){
    return this.porcPtoRepo;
    }
    
     /**
     * @return: devuelve existencia minima aceptada  del producto de tipo int
     */
    public int getExistMinima(){
    return this.existMinima;
    }
    
     /**
     * @return: devuelve unformacion del laboratorio del producto de tipo Laboratorio
     */
    public Laboratorio getLaboratorio(){
    return this.laboratorio;    
    }   
    
    //-------------------------------------------------------------------------

     /**
     * Constructor de la clase Producto.
     * 
     * @param: p_codigo: codigo de identificacion dle producto
     * @param:p_rubro: rubro al que pertenece
     * @param:p_descripcion: descripcion del producto
     * @param: p_costo: valor de costo
     * @param: p_stock: stock disponible del mismo
     * @param: p_porc: punto de reposicion dle proudcto
     *  @param: p_existMin: existencia minima 
     *  @param: p_laboratorio: Laboratorio al cual pertenece su produccion
     *
     * 
     */
    public Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, int p_stock, double p_porc, int p_existMin, Laboratorio p_laboratorio){
    this.setCodigo(p_codigo);
    this.setRubro(p_rubro);
    this.setDescripcion(p_descripcion);
    this.setCosto(p_costo);
    this.setStock(p_stock);
    this.setPorcPtoRepo(p_porc);
    this.setExistMinima(p_existMin);
    this.setLaboratorio(p_laboratorio);
    }
        
    /**
     * Constructor de la clase Producto.
     * 
     * @param: p_codigo: codigo de identificacion dle producto
     * @param:p_rubro: rubro al que pertenece
     * @param:p_descripcion: descripcion del producto
     * @param: p_costo: valor de costo
     *  @param: p_laboratorio: Laboratorio al cual pertenece su produccion
     *  
     *  Los demas atributos ya tienen valores pre definidos en 0,
     *
     * 
     */
    public Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, Laboratorio p_laboratorio){
    this.setCodigo(p_codigo);
    this.setRubro(p_rubro);
    this.setDescripcion(p_descripcion);
    this.setCosto(p_costo);
    this.setLaboratorio(p_laboratorio);
    this.setStock(0);
    this.setPorcPtoRepo(0);
    this.setExistMinima(0);
    }
    
     /**
     * Rrealzia ajustes sobre ls stock, sea ampliando o restando
     */
    public void Ajuste(int p_cantidad){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Desea ampliar o  reducir el stock? (1-Ampliar/2-Reducir)");
        int respuesta = teclado.nextInt();
        
        if(respuesta==1){
            this.setStock(this.getStock()+p_cantidad);
        }else{
            this.setStock(this.getStock()-p_cantidad);
        };
        
    }
    
    /**
     * Devuele el valor de lista dle producto, realizando el calculo correspondiente
     */
    public double precioLista(){
        return this.getCosto()+(this.getCosto() * 0.12);
    }
    
    /**
     * Devuelve el valor de precio de contado del producto, una vez realizado
     * el calculo correspondiente
     */
    public double precioContado(){
        return this.getCosto()-(this.getCosto()*0.05);
    }
    
     /**
     *Devuelve el valor del stock una vez que se realiza el calculo correspondiente
     */
    public double stockValorizado(){
        double rentabilidad = (this.getStock()*this.getCosto())*0.12;
        return (this.getStock()*this.getCosto()) + rentabilidad;
    }
    
    /**
     * Modifica el pro de reposicion del producto
     * @param: p_porce: nuevo punto de reposicion
     */
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
        
    }
    
    /**
     * Modifica la existencia minima del producto
     * @param: p_cantidad: nueva existencia minima
     */
    public void ajustarExistMin(int p_cantidad){
        
        this.setExistMinima(p_cantidad);
    }
    
    /**
     * Este metodo imprime la informacion solicitada, tal como datos del laboratorio
     * como del producto mismo
     */
    public void Mostrar(){
        System.out.println("----------------------------------------------------");
        System.out.println("Laboratorio: " + this.getLaboratorio().getNombre());
        System.out.println("Domicilio: "+this.getLaboratorio().getDomicilio());
        System.out.println("Telefono: "+ this.getLaboratorio().getTelefono());
        System.out.println("----------------------------------------------------");
        System.out.println("Rubro: " +this.getRubro());
        System.out.println("Descripcion: " +this.getDescripcion());
        System.out.println("Precio costo: "+this.getCosto());
        System.out.println("Stock: "+this.getStock());
        System.out.println("Stock valorizado: "+this.getPorcPtoRepo());
        System.out.println("----------------------------------------------------");

    }
    
     /**
     * Este metodo imprime la informacion solicitada
     */
    public String MostrarLinea(){
        
        return this.getDescripcion()+"  "+this.precioLista()+" "+this.precioContado();
    }
}