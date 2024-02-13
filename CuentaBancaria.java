
/**
 * Abstraccion de una cuenta bacnaria al cual se le solicita diferentes datos
 * para su posterior publicacion y manejo de los metodos
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */

public class CuentaBancaria
{
        //Definicion de atributos;-------------------------------------------

    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
   /**
     * Constructor de la CuentaBancaria .
     * 
     * @param: p_nroCuenta: Numero de cuenta
     * @param: p_titular: persona titular de la cuenta de tipo Persona
     * 
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }
    
    /**
     * Segundo Constructor de la CuentaBancaria .
     * 
     * @param: p_nroCuenta: Numero de cuenta
     * @param: p_titular: persona titular de la cuenta de tipo Persona
     * @param: p_saldo: Saldo disponible de la cuenta
     * 
     */
        public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    //Setters---------------------------------------------------------------
    
    /**
     * @param: p_cuenta:Numero de cuenta
     */
    private void setNroCuenta( int p_cuenta){
        this.nroCuenta=p_cuenta;
    }
    
    
    /**
     * @param: p_saldo: Saldo disponible de la cuenta
     */
    private void setSaldo(double p_saldo){
        this.saldo=p_saldo;
    }
    
    
    /**
     * @param:  p_titular: persona titular de la cuenta de tipo Persona
     */
    private void setTitular(Persona p_titular){
        this.titular=p_titular;
    }
    //Getters------------------------------------------------------------
    
    /**
     * @return:Devuelve le numero de cuenta bacnaria
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
        /**
     * @return:Devuevle le titular dela cuenta bacnaria de tipo Persona
     */
        public Persona getTitular(){
        return this.titular;
    }
    
        /**
     * @return:Deuvelve le saldo disponible dela cuenta
     */
        public double getSaldo(){
        return this.saldo;
    }
    //------------------------------------------------------
    
    /**
     * Modifica el balance de la cuenta de acuerdo al deposito pasado como parametro
     * @param: p_importe: importe a agregar al saldo
     */
    public double Depositar (double p_importe){
        double deposito= this.getSaldo() + p_importe;
        return deposito;
    }
    
    /**
     * Modifica el balance de la cuenta de acuerdo al deposito pasado como parametro
     * @param: p_importe: importe a restar del saldo
     */
    public double Extraer (double p_importe){
        double extraccion= this.getSaldo() - p_importe;
        return extraccion;
    }
    
    /**
     * Imprimir informacion solicitada con respecto al balance y titularidad de la cuenta bancaria
     */
    public void Mostrar (){
        System.out.println("-Cuenta Bncario-");
        System.out.println("Titular: "+ this.getTitular().NomYaApe()+"("+this.getTitular().Edad()+" anos)");
        System.out.println("Saldo: "+this.getSaldo());
    }
    
    /**
     * Imprime datos de la cuenta como el titular y el saldo
     */
    public String ToString(){
        return this.getNroCuenta() +"   "+ this.getTitular().NomYaApe() +"  "+ this.getSaldo();
    }
    
    
}