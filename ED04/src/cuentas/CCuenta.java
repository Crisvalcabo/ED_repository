package cuentas;
/**
 * Representa una cuenta corriente asociada.
 * 
 * Incluye las operaciones de creación de la cuenta, consulta de estado, ingreso y retirada de efectivo.
 * @author Cristina V. C.
 * @version 1.0
 * @since 04/03/2024
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/**
	 * Constructor sin parámetros de la clase CCuenta
	 */
	public CCuenta()
    {
    }

	/**
	 * Construnctor de la cuenta corriente.
	 * 
	 * @param nom nombre del propietario de la cuenta
	 * @param cue número de cuenta
	 * @param sal saldo inicial
	 * @param tipo tipo de interés
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return saldo actual.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa la cantidad especificada.
     * @param cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira si es posible la cantidad indicada de la cuenta
     * @param cantidad
     * @throws Exception si la cantidad es negativa o mayor al saldo de la cuenta.
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
