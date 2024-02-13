/**
 * Abstraccion de un punto al cual se le solicita diferentes datos personales para su posterior publicacion y manejo.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */

public class Punto {
    //Atributos de la clase Punto.
    
    private double x;
    private double y;
   
    /**
     * Constructor de la clase punto.
     * En este los atributos ya se encuentra inicializados con valores predeterminados en 0.
     */
    public Punto (){
        this.setX(0);
        this.setY(0);
    }
   
    /**
     * Constructor de la clase Punto.
     * 
     * @param: p_x: Valor del punto de referencia con respecto a la recta X.
     * @param: p_y: Valor del punto de referencia con respecto a la recta Y.
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
   
    
    //Definimos los setters de cada atributo-----------------------------------------
    /**
     * @param:p_x: Valor del punto de referencia con respecto a la recta X.
     */
    private void setX(double p_x){
        this.x=p_x;
       
    }
   
    /**
     * @param:p_y: Valor del punto de referencia con respecto a la recta Y.
     */
    private void setY(double p_y){
        this.y=p_y;
       
    }
   
    //Definimos los getters de cada atributo-----------------------------------------
    
    /**
     * @return: Devuelve el valor asignado a X.
     */
    public double getX(){
        return this.x;
    }
   
    /**
     * @return: Devuelve el valor asignado Y.
     */
    public double getY(){
        return this.y;
    }
    
    /**
     * Suma nuevos valores a los ya asignados anteriormente a X e Y, cuando estos puntos son desplazados de su ubicaicon anterior.
     */
    public void Desplazar(double p_dx, double p_dy){
        this.x+=p_dx;
        this.y+=p_dy;
    }
   
    /**
     * Imprime los datos de la coordenada segun su estado actual.
     */
    public void Mostrar(){
        System.out.println("Punto X: " + this.getX()+" Y: "+this.getY());
        
    }
   
    /**
     * @return: Devuelve en una linea el valor de la coordenada segun el valor de los puntos X,Y.
     */
    public String Coordenadas(){
        return "("+this.getX()+", "+this.getY()+")";
    }
   
     /**
     * @return: retorna la distancia entre dos puntos realizando el calculo
     * correspondiente.
     * 
     * @param: p_ptoDistante: punto el cual se utiliza para comparar junto con el
     * punto encargado de ejecutar le metodo
     */
    public double DistanciaA(Punto p_ptoDistante){
        double distancia= Math.sqrt(((Math.pow((p_ptoDistante.getX()-this.getX()), 2)) + (Math.pow((p_ptoDistante.getY()-this.getY()), 2))));
        return distancia;
        
    }
}