 import java.util.*;
import java.util.ArrayList;
/**
 * Abstraccion de un Bnaco el cual realiza diversos manejos de informacion con respecto
 * a los empleados de una determianda sucursal, asi como tambien de las cuentas de los clientes
 * 
 * 
 * @author (Yago Ayala) 
 * @version (1.0)
 */
public class Banco
{
    //Atributos de la clase Banco-----------------------------------
    private String nombre;
    private int nroScurusal;
    private ArrayList<Empleado> empleados;
    private ArrayList<CuentaBancaria> cuentas;
    private Localidad localidad;    
    
    
    /**
     * Constructor dela clase Banco
     * @param:p_nombre: nombre de la sucursal
     * @param:p_localidad: localidad en la cual se encuentra la sucursal
     * @param:p_nroSucursal: numero de identificacion de la sucursal
     * @param:p_empleado: empleado de la sucursal
     */
            public Banco (String p_nombre, Localidad p_localidad, int p_nroSucursal,
    Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroScurusal(p_nroSucursal);
        this.setEmpleados(new ArrayList<Empleado>());
        this.setCuentas(new ArrayList<CuentaBancaria>());
        this.AgregarEmpleado(p_empleado);
    }
    
     /**
     * Constructor dela clase Banco
     * @param:p_nombre: nombre de la sucursal
     * @param:p_localidad: localidad en la cual se encuentra la sucursal
     * @param:p_nroSucursal: numero de identificacion de la sucursal
     * @param:p_empleados: lista de empleados de la sucursal
     */
    public Banco (String p_nombre, Localidad p_localidad, int p_nroSucursal,
    ArrayList<Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroScurusal(p_nroSucursal);
        this.setCuentas(new ArrayList<CuentaBancaria>());
        this.setEmpleados(p_empleados);
    }
    
    /**
     * Constructor dela clase Banco
     * @param:p_nombre: nombre de la sucursal
     * @param:p_localidad: localidad en la cual se encuentra la sucursal
     * @param:p_nroSucursal: numero de identificacion de la sucursal
     * @param:p_empleados: lista de empleados de la sucursal
     * @param: p_cuentas: lista de cuentas bancarias de los clientes de la sucursal
     */
        public Banco (String p_nombre, Localidad p_localidad, int p_nroSucursal,
    ArrayList<Empleado> p_empleados,ArrayList<CuentaBancaria> p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroScurusal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentas(p_cuentas);
    }
    
    /**
     * Constructor dela clase Banco
     * @param:p_nombre: nombre de la sucursal
     * @param:p_localidad: localidad en la cual se encuentra la sucursal
     * @param:p_nroSucursal: numero de identificacion de la sucursal
     * @param:p_empleados: lista de empleados de la sucursal
     * @param: p_cuenta: Cuenta de determinado cliente de la sucursal
     */
     public Banco (String p_nombre, Localidad p_localidad, int p_nroSucursal,
     CuentaBancaria p_cuenta){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroScurusal(p_nroSucursal);
        this.setEmpleados(new ArrayList<Empleado>());
        this.setCuentas(new ArrayList<CuentaBancaria>());
        this.AgregarCuentaBancaria(p_cuenta);
    }
    
    
    /**
     * @return: devuelve le nombre de la sucursal
     */
    public String getNombre(){
        return this.nombre;
        }
    
        /**
         * @param_ p_nombre: Nombre de la sucursal
         */
    public void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    
    /**
     * @return: devuelve le numero de identificacion de la sucursal
     */
    public int getNroScurusal(){
        return this.nroScurusal;
    }

    /**
     * @param: p_nroSucursal: Numero de identificacion de la sucursal
     */
    public void setNroScurusal(int p_nroScurusal){
        this.nroScurusal = p_nroScurusal;
    }
    
    /**
     * @return: devuelve la lista de empelados de la sucursal
     */
        public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }
    
    /**
     * @param: p_empleados: se refiere a la lsita de empelados de la sucursal
     */
    public void setEmpleados(ArrayList<Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    /**
     * @return: devuelve la localidad de la sucursal
     */
    public Localidad getLocalidad(){
        return this.localidad;
    }

    /**
     * @param:`p_localidad: Se refiere a la localidad de la sucursal
     */
    public void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    
    /**
     * @return: devuelve la lista de cuentas de los clientes de la sucursal
     */
    public ArrayList<CuentaBancaria> getCuentas(){
        return this.cuentas;
    }
    
    /**
     * @param:p_cuentas: Se refiere a la lsita de las cuentas bancarias de los cleintes de la sucursal
     */
    private void setCuentas(ArrayList<CuentaBancaria> p_cuentas){
        this.cuentas=p_cuentas;
    }
    

    /**
     * Este metodo se encarga de agregar un empleado nuevo a la sucursal
     * @param_p_empleado: Nuevo empleado de la scuursal
     */
    public boolean AgregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * Este metodo se encarga de quitar un empleado de la lista de los que trabajan en la sucursal
     * en el caso de que ocurra un despido
     * 
     * @param: p_empleado: Empleado despedido de la entidad
     */
    public boolean QuitarEmpleado(Empleado p_empleado){
        if(empleados.isEmpty()){
            return false;
                }else{
            return this.getEmpleados().remove(p_empleado);
    }
    }
    
    /**
     * Este metodo se encarga de calcular la totalidad de los sueldos apagar
     * @return: total de la suma de los sueldos a pagar de lso empleados de la entidad
     */
    public double SueldosAPagar(){
        double totalSueldos=0;
        for(Empleado unEmpleado: this.getEmpleados()){
            totalSueldos+=unEmpleado.SueldoNeto();
        }
        return totalSueldos;
    }
    
    /**Este metodo crea una lista con todos los sueldos de los empelados de la sucursal bancaria
     * 
     */
    public void ListarSueldos(){
        for(Empleado unEmpleado: this.getEmpleados()){
            System.out.println("\n"+unEmpleado.getCuil()+"   "+unEmpleado.NomyApe()+
            "________________________$"+unEmpleado.SueldoNeto());
        }
    }
    
    /**
     * Este metodo se encarga de Publicar todos los datos con respecto a la totaliudad de mepleados, sus datos
     * el total a sueldos  a pagar asi como el salario de cada uno
     */
    public void Mostrar(){
        System.out.println("Banco: "+this.getNombre()+"               Sucursal: "+
        this.getNroScurusal());
        System.out.println("Localidad: "+this.localidad.getNombre()+"        "+
        "Provincia:" +this.localidad.getProvincia());
        System.out.println("-----------------------------------------------------------");

        
        this.ListarSueldos();
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Total a pagar ________________________________ $"+this.SueldosAPagar());
         
    }
    
    
    /**
     * Este metodo se encarga de agregar una nueva cuenta bancaria
     * cada vez que se da de alta un nuevo cliente
     * @param: p_cuenta: Nueva cuenta bancaria que se agrega
     */
    public boolean AgregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentas().add(p_cuenta);
    }
    
    /**
     * Este metodo se encarga de remover una cuenta bancaria cuansdo se da de baja un cliente
     * de la entidad.
     * @param: p cuenta: Cuenta que se da de baja
     */
    public boolean QuitaCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentas().remove(p_cuenta);
    }
    
    
    /**
     * Se encarga de lista todas las cuentas cuyo saldo es igual a 0:
     */
    private void MostrarSaldoCero(){
        int totalCero=0;
        for(CuentaBancaria unaCuenta: this.getCuentas()){
            if(unaCuenta.getSaldo()==0){
             totalCero+=1;
            System.out.println(unaCuenta.getTitular().getNroDni()+"     "+unaCuenta.getTitular().getNombre()
            +", "+unaCuenta.getTitular().getApellido());
            }
        }
    }
    
    /**
     * Se encarga de realizar una suma de todas las cuentas que se encuentran activas actualmente
     * en la entidad
     */
    private int CuentasSaldoCero(){
        int totalCero=0;
        for(CuentaBancaria unaCuenta: this.getCuentas()){
            if(unaCuenta.getSaldo()==0){
             totalCero+=1;
            }
        }
             return totalCero;
            }
    
            /**
             * Se encarga de sumar la totalidad de cuentas activa actualmente enla entidad
             */
    private int CuentasSaldoActivo(){
        int totalActivo=0;
        for(CuentaBancaria unaCuenta: this.getCuentas()){
            if(unaCuenta.getSaldo()>0){
                totalActivo+=1;
            }
        }
        return totalActivo;
    }
    
    /**
     * Muestra un resumen de la informacion solicitada on respecto a las cuentas activas,
     * las que no, y cuantas son
     */
    public void MostrarResumen(){
        System.out.println("Banco: "+this.getNombre()+"               Sucursal: "+
        this.getNroScurusal());
        System.out.println("Localidad: "+this.localidad.getNombre()+"        "+
        "Provincia:" +this.localidad.getProvincia());
        
        System.out.println("\n************************************************************");
        System.out.println("            RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("************************************************************");
        System.out.println("Numeroo total de Cuentas Bancarias: "+(CuentasSaldoCero()+CuentasSaldoActivo()));
        System.out.println("Cuentas Activas: "+CuentasSaldoActivo());
        System.out.println("Cuentas Saldo cero: "+CuentasSaldoCero());
        
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Titulares con cuenta saldo cero: ");
        System.out.println("-----------------------------------------------------------");
        MostrarSaldoCero();
        System.out.println("-----------------------------------------------------------");
    }
}







