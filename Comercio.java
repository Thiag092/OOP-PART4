import java.util.*;
import java.util.HashMap;

/**
 *Abstraccion de un comercio el cual se solicita diversos datos de los empelados
 *para su psoterior manejo y pedido de informes
 * 
 * @author ( Yago Ayala) 
 * @version (1.0)
 */
public class Comercio
{
    //Atributos de la clase Comercio-----------------------------------------------
    private String nombre;
    private HashMap <Long, Empleado> empleados;
    
    
    /**
     * Constructor de la clase Comercio
     * @param:p_nombre_ Nombre dle comercio
     */
    public Comercio(String p_nombre){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }
    
    /**
     * Constructor de la clase Comercio
     * @param:p_nombre_ Nombre dle comercio
     * @param: p_empleado: Lista de empleados del comercio
     */
    public Comercio(String p_nombre,HashMap <Long, Empleado> p_empleado){
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleado);
    }
    

    //Definimos Setters y Getters---------------------------------------
    /**
     * @return: devuelve el nombre dle comercio
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * @param: p_nombre: Nombre del comercio
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * @rturn: devuelve la lista de empleados del comercio
     */
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }

    /**
     * @param:p_empleados: Lista de los empelados del comercio
     */
    private void setEmpleados(HashMap<Long, Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    //--------------------------------------------------------------------------------
    
    /**
     * Este metodo se encarga de cargar un nuevo empelado cuando es contratado
     * a la lista existente
     * @param: p_empleado: Nuevo empleado
     */
    public void AltaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(new Long(p_empleado.getCuil()),p_empleado);
    }


    /**
     * Se encarga de quitar al empleado pasado por parametro de la lista existente de trabajadores
     * de la organizacion cuando se es despedido
     * @param:p_empleado: Empleado despedido del comercio
     */
    public Empleado BajaEmpleado(long p_cuil){
        return this.getEmpleados().remove(p_cuil);
        
    }
    
    /**
     * Este metodo se encarga de devolver la cantidad de empleados trabajando en el comercio
     * @return: cantidad de empelados de la organizacion
     */
    public int CantidadDeEmpleados(){
        int cantidadEmpleados=0;
        for(Map.Entry<Long,Empleado> unEmpleado: empleados.entrySet()){
            if(unEmpleado!=null){
                cantidadEmpleados++;
            }
        }
        return cantidadEmpleados;
    }
    
    /**
     * Corrobora su un determinado empelado el cual se ubica mediante el numero de cuil, trabaja en el comercio
     * @param_p_cuil: Numero del cuil el cual se busca en la nomina de empleados
     */
    public boolean EsEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    
    /**
     * Busca un determiando empelado mediante su numero de cuil 
     * @param:p_cuil: Numero del cuil del empleado buscadoi
     */
    public Empleado BuscarEmpleado(long p_cuil){
        return this.getEmpleados().get(p_cuil);
    }
    
    /**
     * Devuelve el sueldo neto del empleado buscado por numero de cuil 
     * @param:p_cuil:numero del cuil del empelado
     */
    public void SueldoNeto(long p_cuil){
        System.out.println(this.getEmpleados().get(p_cuil).SueldoNeto());
        
    }
    
    /**
     * Se encarga de imprimir la nomina completa de enmpleados del comerico
     * asi como sus datos perosnales y sueldo neto
     */
    public void Nomina(){
        for(Map.Entry<Long,Empleado> unEmpleado: empleados.entrySet()){
            System.out.println(unEmpleado.getValue().getCuil()+" - "+
            unEmpleado.getValue().ApeyNom()+"----------$"+
            unEmpleado.getValue().SueldoNeto());
        }
    }
}