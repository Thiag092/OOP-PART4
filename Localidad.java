public class Localidad
{
    //ATRIBUTOS DE LA CLASE............................
    
       private String nombre;
    private String provincia;

    /**
     * Constructor de la clase Localidad
     * @param: p_nombre: Nombre de la localidad
     * @param: p_provincia: Provincia en la cual se encuentra la localidad
     */
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    /**
     * @param:p_nombre: Nombre de la localidad
     */
   private void setNombre(String p_nombre){
       this.nombre=p_nombre;
   }
   
   /**
    *     @param_ p_provincia: Nombre de la provincia a la cual eprtenece la localidad

    */
   private void setProvincia(String p_provincia){
       this.provincia=p_provincia;
   }
   
   /**
    * @return: Devuelve le nombre de l alocalidad
    */
   public String getNombre(){
       return this.nombre;
   }
   /**
    * @return: devuelve la provinci a la cual pertenece la localidad
    */
   public String getProvincia(){
       return this.provincia;
   }
   
   /**
    * Dicho metodo devuelve le nombre de la localidad junto ocn la Provincia
    * a la cual pertenece
    */
    public void Mostrar(){
        System.out.println("Localidad: "+this.getNombre());
        System.out.println("Provincia: "+this.getProvincia());
    }    
}
