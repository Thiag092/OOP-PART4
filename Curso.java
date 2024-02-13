import java.util.*;
import java.util.HashMap;

/**
 * 
 * Abstraccion de un curso, el cual se solicita diversos datos de alumnos
 * para su posterior manerjo
*/
public class Curso
{
   //Atributos de la clase Curso-------------------------------------------------
   private String nombre;
   private HashMap <Integer,Alumno> alumnos;
   
   
   /**
    * Primer constructor de la clase
    * @param_ p_nombre: Nombre del curso
    */
   public Curso (String p_nombre){
       this.setNombre(p_nombre);
       this.setAlumnos(new HashMap <Integer,Alumno>());
       
   }
   
   
   /**
    * Segundo constructor de la clase
    * @param:p_nombre: nombre del curso
    * @param: p_alumno: Alumnos que es incorporado al curso
    */
   public Curso (String p_nombre, HashMap<Integer,Alumno> p_alumno){
       this.setNombre(p_nombre);
       this.setAlumnos(p_alumno);
       
   }
    

    //Definimos los Setters y Getters----------------------------------------
    /**
     * @return: devuelve le nombre del curso
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * @param:p_nombre: nombre del curso
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * @return: devuelve el listado de los alumnos inscriptos al curso
     * 
     */
    public HashMap <Integer,Alumno> getAlumnos(){
        return this.alumnos;
    }

    /**
     * @param:p_alumnos: Listado de los alumnos inscriptos al curso
     */
    private void setAlumnos(HashMap <Integer,Alumno> p_alumnos){
        this.alumnos = p_alumnos;
    }
    //----------------------------------------------------------------
    
    /**
     * Metodo encargado de agregar un alñumno al lsitado del curso
     * cada vez que se ingresa uno nuevo
     */
    public void InscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(new Integer(p_alumno.getLu()), p_alumno);
    }
    
    /**
     * Metodo encargado de eliminar de la lista de cursantes al alumno perteneciente
     * al numero de libreta universitaria ingresado por parametro
     * 
     */
    public Alumno QuitarAlumno(int p_lu){
        return this.getAlumnos().remove(new Integer(p_lu));
    }
    
    /**
     * Rrealiza el calculo de la cantidad de alumnos inscriptos al curso
     */
    public int CantidadDeAlumnos(){
        int cantidadAlumnos=0;
        for(Map.Entry<Integer,Alumno> unAlumno: alumnos.entrySet()){
            if(unAlumno!=null){
                cantidadAlumnos++;;
            }
        }
        return cantidadAlumnos;
    }
    
    /**
     * Corrobora si determinado alumno perteneciente al numero de libreta se ncuentra cursando 
     * @param: p_lu: Numero de libreta universitaria
     */
    public boolean EstaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    
    /**
     * Corrobora si un determiando alumno buscado por Nombre esta cursando
     * @param: p_alumno: Alumno que se busca
     */
    public boolean EstaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);
    }    
    
    /**
     * 
     */
    public Alumno BuscarAlumno(int p_lu){
        return this.getAlumnos().get(p_lu);
    }
    
    /**
     * Imprimer le promedio del alumno al cual pertenece le numero de libnreta universitaria
     * pasado como aprametro
     */
    public void ImprimirPromedioDelAlumno(int p_lu){
        this.getAlumnos().get(p_lu);
        
    }
    
    /**
     * Imprime los alumnos inscriptos a la materia junto con diversos datos perosnales
     */
    public void MostrarInscriptos(){
        for(Map.Entry<Integer,Alumno> unAlumno: alumnos.entrySet()){
            System.out.println(unAlumno.getValue().getLu()+"    "+
            unAlumno.getValue().getNombre()+", "+unAlumno.getValue().getApellido());
        }
    }
    }
    