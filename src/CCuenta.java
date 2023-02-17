/**
 * Clase CCuenta para gestionar una cuenta bancaria
 * @author Maria
 */
public class CCuenta {

    /**
     * Método que devuelve el nombre
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el valor del atributo nombre
     * @param nombre String con el valor del atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el valor del atributo cuenta
     * @return la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para establecer el valor del atributo cuenta
     * @param cuenta String con el valor de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el valor del atributo saldo
     * @return el atributo saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer el valor del atributo saldo
     * @param saldo String con el valor del atributo saldo a modificar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el atributo tipo interés
     * @return un double con el tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para establecer el valor del atributo tipoInterés
     * @param tipoInterés double con el valor del atributo a modificar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor del método sin atributos
     */
    public CCuenta()
    {
    }

    /**
     * Construcctor del método con todos los atributos de la clase CCuenta
     * @param nom String con el nombre 
     * @param cue String con el número de cuenta
     * @param sal Double con el saldo de la cuenta
     * @param tipo Double con el tipo de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Devuelve el estado actual de la cuenta
     * @return double con el saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Método para ingresar dinero en la cuenta
     * @param cantidad double con la cantidad a ingresar
     * @throws Exception Lanza una excepción si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad Double con la cantidad de dinero a retirar
     * @throws Exception El sistema lanza una excepción cuando la cantidad es negativa o cuando se quiere sacar más dinero del que hay
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
