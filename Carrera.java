import java.util.Scanner;
/**
 * Clase ejecutable de la clase Curso, la cual se encarga de cargar datos
 * al listado de alumnos para su posterior manejo
 * 
 * @author (Yago Ayala) 
 * @version (1.0 - 20/09/2023)
 */
public class Carrera
{
    public static void main (String [] args){
        Scanner teclado=new Scanner(System.in);
        int opcion=0;
        //5.1.1. Crear una instancia de Curso y varias de la clase Alumno--------
        //5.1.2. Asignarles notas de parciales a los alumnos-------------------
        Curso curso1 = new Curso("POO");

        Alumno alumno1= new Alumno(11,"Yago", "Ayala", 4,7);
        Alumno alumno2= new Alumno(22,"Juan", "Gomez", 8,10);
        Alumno alumno3= new Alumno(33,"Cristian", "Alvarez", 10,9);
        Alumno alumno4= new Alumno(44,"Maria", "Becerra", 5,8);
        Alumno alumno5= new Alumno(55,"Pedro", "Sanchez", 1,4);
        Alumno alumno6= new Alumno(66,"Martin", "Esquivel", 6,8);
        
        //5.1.3. Inscribir los alumnos al curso creado anteriormente.-----------
        curso1.InscribirAlumno(alumno1);
        curso1.InscribirAlumno(alumno2);
        curso1.InscribirAlumno(alumno3);
        curso1.InscribirAlumno(alumno4);
        curso1.InscribirAlumno(alumno5);
        curso1.InscribirAlumno(alumno6);
        
        
        
        while(opcion!=5){
         System.out.println("\n---------------------------------------------");
         System.out.println("Ingrese una opcion");
        System.out.println("1-Cantidad de inscriptos a la materia");
        System.out.println("2-Eliminar un alumno de la lista");
        System.out.println("3-Buscar alumno por numero de libreta");
        System.out.println("4-Buscar promedio del alumno por numero de libreta");
        System.out.println("5-Salir");
        System.out.println("\n---------------------------------------------");
        opcion=teclado.nextInt();
                    
        switch(opcion){
        
        
        case 1:
            //5.1.4. Imprimir la cantidad y la lista de alumnos inscriptos al curso-------
            System.out.println("\n Cantidad de inscriptos: "+curso1.CantidadDeAlumnos());
            curso1.MostrarInscriptos();
                     System.out.println("-----------------------------------------------------------------------");
            
            break;

            case 2:
                //5.1.5. Dar de baja un alumno del curso, y luego verificar ---------------
        //que no esté inscripto-----------------------------------------------------
        System.out.println("\n**** Se da de baja a "+curso1.getAlumnos().get(33).NomyApe()+
        " porque abandona el curso ****");
        curso1.QuitarAlumno(33);
         //5.1.6. Imprimir nuevamente la lista de alumnos para ver como que queda
        //definitivamente y la cantidad total de alumnos inscriptos en el curso-----
        System.out.println("Quedando la lista de la siguiente forma: ");
        System.out.println("\n Cantidad de inscriptos: "+curso1.CantidadDeAlumnos());
        curso1.MostrarInscriptos();   
        System.out.println("-----------------------------------------------------------------------");
        break;
                
        case 3:
            //5.1.7. Buscar un alumno por su libreta. Una vez encontrado, 
        //mostrarlo con el método apropiado.------------------------------------
       
        
        System.out.println("\n ****Busca y muestra el alumno con numero de libreta "+
        curso1.getAlumnos().get(22).getLu()+" ****");
        curso1.getAlumnos().get(22).Mostrar();
        System.out.println("-----------------------------------------------------------------------");
        
        break;
        
        case 4:
            
             //5.1.8. Mostrar el promedio del alumno solicitado, según libreta-------
             
        System.out.println("\n****-- Mostrar promedio del alumno "+curso1.getAlumnos().get(66).getLu()+"***");
        System.out.println("Promedio: "+curso1.getAlumnos().get(66).Promedio());       
        
        System.out.println("-----------------------------------------------------------------------");        
            break;
            
            case 5:
                System.out.println("GRACIAS POR USAR EL SERVICIO");
                System.out.println("-----------------------------------------------------------------------");
                break;
                
                default:
                    System.out.println("ERROR-OPCION NO VALIDA");
        
    }
    }
        
       
 }
    
}
