/**
 * Abstraccion de un alumno al cual se le solicita diferentes datos personales para su posterior publicacion y manejo para le promedio.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */

public class Alumno {
   
    /**
     * Atributos de la clase Alumno
     */
    
    private int lu;
    private String apellido;
    private String nombre;
    private double nota1;
    private double nota2;
   
    
    /**
     * Constructor de la calse Alumno, el cual los ultimos dos atributos ya estan inicializados en "0".
     * 
     * @param: p_lu: Numero de libreta universitaria del alumno.
     * @param: p_nombre: Nombre del alumno.
     * @param: p_apellido: Apellido del alumno.
     * 
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido){
       
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }
    
    /**
     * Constructor de la calse Alumno, el cual los ultimos dos atributos ya estan inicializados en "0".
     * 
     * @param: p_lu: Numero de libreta universitaria del alumno.
     * @param: p_nombre: Nombre del alumno.
     * @param: p_apellido: Apellido del alumno.
     * 
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido, double p_nota1, 
    double p_nota2){
       
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(p_nota1);
        this.setNota2(p_nota2);
    }
    
    //Definimos los setters de cada atributo-----------------------------------------
    /**
     * @param: p_lu: Numero de libreta universitara dle alumno.
     */
    private void setLu(int p_lu){
        this.lu=p_lu;
    }
    /**
     * @param: p_nombre: Nombre del alumno.
     */
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    
    /**
     * @param: p_apellido: Apellido del alumno.
     */
    private void setApellido(String p_apellido){
        this.apellido=p_apellido;
    }
    
    /**
     * @param: p_nota1: Primera nota de evaluacion del alumno.
     */
    private void setNota1(double p_nota1){
        this.nota1=p_nota1;
    }
    
    /**
     * @param: p_nota2: Segunda nota de evalulaciopn del alumno.
     */
    private void setNota2(double p_nota2){
        this.nota2=p_nota2;
    }
    
    //Ahora definimos los Getters de cada atributo:-------------------------------------
    
    /**
     * @return: Devuelve el numero de libreta universitaria del alumno.
     */
    public int getLu(){
        return this.lu;
        }
    
        /**
         * @return: devuelve el nombre del alumno de tipo String;
         */
    public String getNombre(){
        return this.nombre;
        }
    
        /**
         * @return: devuelve el apellido del alunno de tip oString.
         */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * @return: Devuelve la nota dle primer examen del alumno.
     */
    public double getNota1(){
        return this.nota1;
    }
   
    /**
     * @preturn: Devuelve la nota del segundo examen del alumno:
     */
    public double getNota2(){
        return this.nota2;
    }
   
    /**
     * Agrega el valor de la primer nota del alumno.
     */
    public void AgregarNota1(double p_nota1){
        this.setNota1(p_nota1);
    }
    
    /**
     * Agrega el valor de la segunda nota del alumno.
     */
    public void AgregarNota2(double p_nota2){
        this.setNota2(p_nota2);
    }
    
    /**
     * @return: Devuelve tipo de dato booleano de acuerdo a si el promedio de las dos notas del alumno es suficiente o no para aprobar.
     */
    private boolean Aprueba(){
       
        if((this.Promedio())>=7){
            return true;
        }else{
           return false;
        }
       
    }
   
    /**
     * @return: De acuerdo al resultado del metodo "Aprueba", imprime una cadena de caracteres correspondiente con su aprobacion o no de la materia.
     */
    private String LeyendaAprueba(){
        if(this.Aprueba()==true){
        return "(APRUEBA)";
    }else{
        return "(DESAPRUEBA)";
    }
    }
   
    /**
     * @return: Devuelve el valor del promedio de las dos notas del alumno.
     */
    public double Promedio (){
        return ((this.getNota1()+this.getNota2())/2);
    }
   
    /**
     * Devuelve una cadena de caracteres como resultado de la union del nombre y apellido del alumno.
     */
    public String NomyApe(){
       
        String nomYape=this.getNombre()+ " " +this.getApellido();
        return nomYape;
    }
   
    /**
     * Imprime los datos del alumno, tales como nomre completo, numero de librea universitaria, las notas de cada examen con su promedio y estado de aprobacion
     * en la materia.
     */
    public void Mostrar(){
       
        System.out.println("Nombre y apellido: "+this.NomyApe());
        System.out.println("LU: "+this.getLu());
        System.out.println("NOTAS: "+ this.getNota1()+" - "+this.getNota2());
        System.out.println("Promedio: " + this.Promedio()+this.LeyendaAprueba());
        }
    }  