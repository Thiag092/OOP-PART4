import java.util.*;
import java.util.Scanner;

/**
 * Write a description of class GestionComercio here.
     * 
 * @author (your name) 
     * @version (a version number or a date)
         */
    public class GestionComercio{
    
    public static void main (String [] args){
        Scanner teclado1=new Scanner(System.in);
        //Define el nombre dle comercio para su psoterior carga de empleados-----------------------
        Comercio comercio1=new Comercio("SuperMax");
        //Define fechas para ser psoteiromente cargadas en las instancias de clase Empleado----------------------
        Calendar fecha1=new GregorianCalendar();
        Calendar fecha2=new GregorianCalendar(12,12,1992);
        Calendar fecha3=new GregorianCalendar(10,12,1992);
        Calendar fecha4=new GregorianCalendar(7,12,1992);
        Calendar fecha5=new GregorianCalendar(2,12,1992);
        Calendar fecha6=new GregorianCalendar(9,12,1992);
        Calendar fecha7=new GregorianCalendar(22,12,1992);
        
        //Se le crea instancias de la calse Empleado-------------------------------------
        Empleado empleado1=new Empleado(112233,"Yago", "Ayala",10000,fecha1);
        Empleado empleado2=new Empleado(445566,"Juan", "Alvarez",1232,fecha2);
        Empleado empleado3=new Empleado(992233,"Hugo", "Russo",56756,fecha3);
        
        
        //Se agregabn los empleados isntanciados a la nomina del comercio--------------------------
        comercio1.AltaEmpleado(empleado1);
        comercio1.AltaEmpleado(empleado2);
        comercio1.AltaEmpleado(empleado3);
        
        int opcion=0;
           while(opcion!=4){
            
            System.out.println("\n--------------------------------------------");
            System.out.println("\n***Ingrese una opcion***");
            System.out.println("1-Imprimri nomina de empleados");
            System.out.println("2.Eliminar un eempleado");
            System.out.println("3-Buscar empelado por nunmero de CUIL");
            System.out.println("4-Salir");
            opcion=teclado1.nextInt();
            System.out.println("\n--------------------------------------------");
            
        switch(opcion){
            case 1:
                System.out.println("***NOMINA DE EMPLEADOS***");
                comercio1.Nomina();
                 System.out.println("-----------------------------------------------------------------------");
                
                break;
                
                    case 2:
                    //Busca un determinado empelado mediante cuil para despedirlo------------------------------
                System.out.println("\n ****Busca y  el empleado a despedir con numero de CUIL "+
                comercio1.BuscarEmpleado(992233).getCuil());
                System.out.println("Siendo la nueva nomina de emplados la siguiente: ");
                comercio1.BajaEmpleado(992233);
                comercio1.Nomina();
                 System.out.println("-----------------------------------------------------------------------");
                    
                    break;
                    
                    case 3:
                        //Consulta por CUIL si un empleado forma parte de la empresa--------------
                    System.out.println("\n ****Busca y muestra el empleado con numero de CUIL  "+
                    comercio1.BuscarEmpleado(445566).getCuil());
                    System.out.println(comercio1.BuscarEmpleado(445566).MostrarLinea());
                     System.out.println("-----------------------------------------------------------------------");
                        
                        break;
                        
                        case 4:
                            System.out.println("GRACIAS POR USAR EL SERVICIO");
                             System.out.println("-------------------------------------------------------");
                            
                           
                        
        }}
    }
}