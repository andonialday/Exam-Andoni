package controlVersiones;

public class Empleado {
	private String nombre;
	private String apellidos;
	private double salario; 


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

public void subirsalario (double subida) {
	salario=salario+subida;
}


}