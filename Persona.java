   import java.util.*;


/**
 * Abstraccion de un sujeto al cual se le solicita diferentes datos personales para su posterior publicacion.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Persona
{
    //Definicion de atributos;-------------------------------------------
    
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;

    /**
     * Constructor de la clase CopyOfPersona.
     * 
     * @param: p_nroDni: Numero de documento de la persona de hasta 8 digitos.
     * @param: p_nombre: Nombre de la persona.
     * @param: p_apellido: Apellido de la misma.
     * @param: p_anio; Anio de nacimiento.
     * 
     */
    public Persona(int p_nroDni, String p_nombre, String p_apellido, Calendar p_anio){
        this.setNroDni(p_nroDni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    //Definimos los setters de cada atributo-----------------------------------------
    
    /**
     * @param: p_nroDni: Numero de documento de la persona de hasta 8 digitos.
     */
    private void setNroDni(int p_nroDni){
        this.nroDni = p_nroDni;
    }
    
    /**
     * @param: p_nombre: Nombre de la persona.

     */
    private void setNombre (String p_nombre){
        this.nombre=p_nombre;
    }
    
    /**
     * @param: p_apellido: Apellido de la misma.
     */
    private void setApellido(String p_apellido){
        this.apellido=p_apellido;
    }
    
    /**
     * @param: p_anio; Anio de nacimiento.
     */
    private void setAnioNacimiento(Calendar p_anio){
        this.fechaNacimiento=p_anio;
    }
    
   
    
    /**
     * @return: devuelve el numero de dni de la persona de tipo int;
     */
    public int getNroDni (){
        return this.nroDni;
    }
    
    /**
     * @return: devuelve el nombre de la persona de tipo String;
     */
    public String getNombre(){
        return this.nombre;
    }
    
    
    /**
     * @return: devuelve el apellido de la persona de tipo String;
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * @return: Devuelve el anio de nacimiento de la persona de tipo int.
     */
    
    public Calendar getAnioNacimiento(){
        return this.fechaNacimiento;
    }
    
    /**
     * @return: Devuelve la edad de la persona, obtenida de la resta del año actual con el año de nacimiento de la misma.
     */
    public int Edad(){
        Calendar fechaHoy = new GregorianCalendar();
    int anioHoy = fechaHoy.get(Calendar.YEAR);

        return anioHoy - this.getAnioNacimiento().get(Calendar.YEAR);
        
    }
    
    
    public boolean EsCumpleanos(){
        
    Calendar fechaHoy = new GregorianCalendar();
    
    return this.getAnioNacimiento().get(Calendar.MONTH) == fechaHoy.get(Calendar.MONTH)
        && this.getAnioNacimiento().get(Calendar.DAY_OF_MONTH) == fechaHoy.get(Calendar.DAY_OF_MONTH);
    }

        
    
    
    /**
     * @return: Devuelve una cadena de caracteres obtenida como resultado de la union del nombre con el apellido.
     */
    public String NomYaApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Este metodo imprime la informacion de la persona, como puede ser el Nombre completo, numero de documento y su edad.
     */

    public void Mostrar(){
    
        System.out.println("Nombre y Apellido: "+this.NomYaApe());
            System.out.println("DNI :" +this.getNroDni());
                            System.out.println("Edad " +this.Edad() + " años");

        
    }
}

