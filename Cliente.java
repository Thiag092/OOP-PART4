/**
 * Abstraccion del cliente de una empresa al cual se le solicita diferentes datos personales para su posterior publicacion y manejo.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */


public class Cliente
{
    //Definicion de atributos;-------------------------------------------
    
   private int nroDni;
   private String apellido;
   private String nombre;
   private double saldo;
   
   
   /**
     * Constructor de la clase Cliente.
     * 
     * @param: p_nroDni: Numero de documento de la persona de hasta 8 digitos.
     * @param: p_nombre: Nombre de la persona.
     * @param: p_apellido: Apellido de la misma.
     * @param: p_saldo; saldo de la cuenta del cliente.
     * 
     */
   
   public Cliente(int p_nroDni, String p_nombre, String p_apellido, double p_saldo){
       this.setNroDni(p_nroDni);
       this.setApellido(p_apellido);
       this.setNombre(p_nombre);
       this.setSaldo(p_saldo);
   }
   
   //Definimos los setters de cada atributo-----------------------------------------
   
   /**
     * @param: p_nroDni: Numero de documento del cliente de hasta 8 digitos.
     */
   private void setNroDni(int p_nroDni){
       this.nroDni=p_nroDni;
   }
   
   
    /**
     * @param: p_apellido: Apellido del mismo.
     */
   private void setApellido(String p_apellido){
       this.apellido=p_apellido;
   }
   
   
   /**
     * @param: p_nombre: Nombre del cliente.

     */
   private void setNombre(String p_nombre){
       this.nombre=p_nombre;
   }

   /**
    * @param: p_saldo:Saldo de la cuenta dle cliente.
    */
   private void setSaldo(double p_saldo){
       this.saldo=p_saldo;
   }
   
   
   //Ahora definimos los Getters de cada atributo:-------------------------------------
   
    /**
     * @return: devuelve el numero de dni del cliente de tipo int;
     */
    public int getNroDni(){
       return this.nroDni;
   }
   /**
     * @return: devuelve el nombre del cliente de tipo String;
     */
   public String getNombre(){
       return this.nombre;
   }
   
   /**
     * @return: devuelve el apellido del cliente de tipo String;
     */
   public String getApellido(){
       return this.apellido;
   }
   
   /**
    * @return: Devuelve el tipo de dato double que pertenece al saldo de la cuenta del cliente.
    */
   public double getSaldo(){
       return this.saldo;
   }
   
  /**
   * @return: Devuelve un dato de tipo double con el nuevo saldo modificado del cliente.
   */
   public double NuevoSaldo(double p_nuevoSaldo){
       
       this.saldo=p_nuevoSaldo;
       return saldo;
   }
   
   /**
    * @return: Devuelva la suma del saldo existente mas el nuevo valor pasado por parametro.
    */
   public double AgregarSaldo(double p_agregaSaldo){
       
       this.saldo+=p_agregaSaldo;
       return saldo;
   }
   
   /**
    * Devuelve cadena de caracteres como resultado dela union del nombre y apellido del cliente.
    */
   public String ApeYNom(){
       String apeYnom=this.getApellido()+ ", "+this.getNombre();
       return apeYnom;
   }
   /**
    * Este metodo imprime la informacion del cliente, como puede ser el Nombre completo, numero de documento y su saldo.
    */
    public void Mostrar(){
       
       System.out.println("Nombre y Apellido: " +this.getNombre() +" "+this.getApellido()+"("+this.getNroDni()+")");
       System.out.println("Saldo: $" + this.getSaldo());
   }
   
   
}
