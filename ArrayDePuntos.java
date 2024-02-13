import java.util.Scanner;
/**
 * Dicha clase se encarga del manejo de una colecion estatica de objetosde tipo Punto
 * 
 * @author (Yago Ayala) 
 * @version (1.0 - 20/09ç/2023)
 */
public class ArrayDePuntos
{
   public static void main (String[] args){
       Punto [] puntos =new Punto[6];
       Scanner teclado = new Scanner(System.in);
       
       for(int i=0;i<puntos.length;i++){
           //Se agrega los valores por teclado para cada instancia de punto---------------------
           System.out.println("Ingrese el valor de X del elemento " +(i+1));
           double x=teclado.nextDouble();
           
           System.out.println("Ingrese el valor de Y del elemento " +(i+1));
           double y=teclado.nextDouble();
           
           //Se crea la instancia de punto con dichos valores-----------------
           puntos[i]=new Punto(x,y);
       }
       
       //Una vezxz terminada la asignacion de valores de los puntos, se recorre el arreglo con un FOR y muestra los valores-------
       
       for(int i=0;i<puntos.length;i++){
           System.out.println("Las coordenada del punto "+(i+1)+" es " + puntos[i].Coordenadas());
           
       }
       
       //Nuevamente usamos For para imprimir las distancias entre puntos------------------------------------
       for(int i=0;i<puntos.length-1;i++){
           double calculoDsitancia = puntos[i].DistanciaA(puntos[i+1]);
           System.out.println("Distancia entre el punto "+(i+1)+ " y "+(i+2)+": "+ calculoDsitancia);
       }
    
    
    }
}  
