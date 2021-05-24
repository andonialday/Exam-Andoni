package controlVersiones;

/**
 * @author Andoni Alday
 * @since 24 MAY 2021
 * @version Version 1, 2021
 */
public class Empleado {
	private String nombre;
	private String apellidos;
	private double salario;

	// TODO apellido - Apellido del empleado
	// TODO nombre - Nombre del empleado
	// TODO salario - Salario base actual del Empleado

	/**
	 * @param apellido Apellido del empleado
	 * @param apellido Apellido del empleado
	 * @param salario   Salario base actual del Empleado
	 * @return Empleado Constructor de la Clase Empleado. Recibe los valores para
	 *         Nombre (String), Apellidos (String) y Salario (double)
	 */

	
	
	public Empleado(String nombre, String apellido, double salario) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	/**
	 * @param subida Incremento en el salario del Empleado para cálculo del nuevo salario
	 * @return subirsalario Método para caldular el salario final del Empleado tras
	 *         recibir una <i>subida</i>
	 */
	public void subirsalario(double subida) {
		salario = salario + subida;
	}
}