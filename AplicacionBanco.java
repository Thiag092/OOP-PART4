import java.util.*;
import java.util.Scanner;
/**
 * Clase ejcutable de la entidad bancaria, la cual se encarga de incluir nuevos lcientes, cuentas para despues
 * publicar dicha informacio y realizar diversos manejos
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AplicacionBanco
{
    public static void main (String [] args){
        Scanner teclado=new Scanner(System.in);
        Calendar fecha1=new GregorianCalendar();
        Calendar fecha2=new GregorianCalendar(12,12,1992);
        Calendar fecha3=new GregorianCalendar(10,12,1992);
        Calendar fecha4=new GregorianCalendar(7,12,1992);
        Calendar fecha5=new GregorianCalendar(2,12,1992);
        Calendar fecha6=new GregorianCalendar(9,12,1992);
        Calendar fecha7=new GregorianCalendar(22,12,1992);
        
        Localidad localidad1=new Localidad("Capital", "Corrientes");
        
        
        
        //Crea isntancias de la clase Empleado para ser agregada posteriormente a la nomina-------------------------------------
        Empleado empleado1=new Empleado(11223344,"Yago", "Ayala",10000,fecha1);
        Empleado empleado2=new Empleado(11223344,"Juan", "Alvarez",1232,fecha1);
        Empleado empleado3=new Empleado(11223344,"Hugo", "Russo",56756,fecha1);
        
        //Se instancia un objeto de Banco--------------------------------------------------
        Banco banco1=new Banco("RIO",localidad1,25,empleado1);
        
        //Se agregan nuevos empleados contratados al banco---------------------
        banco1.AgregarEmpleado(empleado2);
        banco1.AgregarEmpleado(empleado3);
        
        //Se crean instancias de clase Persona, correspondiente a los titualres de cuentas del banco---------------------------------------
        Persona titular1= new Persona(111,"Juan", "Gomez",fecha2);
        Persona titular2= new Persona(222,"Pedro", "Alvarez",fecha3);
        Persona titular3= new Persona(133311,"Maria", "Gimenez",fecha4);
        Persona titular4= new Persona(111,"Cristian", "Rolon",fecha5);
        Persona titular5= new Persona(222,"Ezequiel", "Sanchez",fecha6);
        Persona titular6= new Persona(133311,"Edgardo", "Bernardes",fecha7);
        
        //Se crean instancais de la clase CuentaBnacaria------------------------------
        CuentaBancaria cuenta1=new CuentaBancaria(1,titular1,200);
        CuentaBancaria cuenta2=new CuentaBancaria(1,titular2,300);
        CuentaBancaria cuenta3=new CuentaBancaria(1,titular3,400);
        CuentaBancaria cuenta4=new CuentaBancaria(1,titular4,0);
        CuentaBancaria cuenta5=new CuentaBancaria(1,titular5,0);
        CuentaBancaria cuenta6=new CuentaBancaria(1,titular6,400);
        
        
        //Dichas cuentas instanciadas se agregan a la lista de cuentas de los bancos para su posterior manejo y listado---------------
        banco1.AgregarCuentaBancaria(cuenta1);
        banco1.AgregarCuentaBancaria(cuenta2);
        banco1.AgregarCuentaBancaria(cuenta3);
         banco1.AgregarCuentaBancaria(cuenta4);
        banco1.AgregarCuentaBancaria(cuenta5);
        banco1.AgregarCuentaBancaria(cuenta6);
        
        //Opciones donde se elije que informacion se requiere, si de empleados o de clientes------------------------------------------
                     int opcion=0;

        
        while(opcion!=4){
            System.out.println("\n---------------------------------------------");
            System.out.println("\n***Elija una opcion***");
        System.out.println("1- Ver informacion de empleados");
        System.out.println("2-Ver resumen de cuentas de clientes");
        System.out.println("3-Despedir un empleado");
        System.out.println("4-Salir");
        opcion=teclado.nextInt();
        System.out.println("\n---------------------------------------------");
        switch(opcion){
            case 1:
                //Imprime los datos de los empleados.--------------------
                banco1.Mostrar();
                break;
                
                case 2:
                    //Imprime los datos de las cuentas del banco---------------------
                    banco1.MostrarResumen();
                    break;
                    
                    case 3:
                        banco1.QuitarEmpleado(empleado2);
                        System.out.println("\nEmpleado eliminado de la nomina con exito");
                        System.out.println("Nueva nomina de empleados: ");
                        banco1.Mostrar();
                        break;
                
                    case 4:
                        System.out.println("\n***GRACIAS POR USAR EL SERVICIO***");
                        break;
                        
        }
        
    }
        
    }
}
