package maven.ejercicioHibernate.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Departamento implements Serializable {
	
	//Declaración de variables
	private int codigo;
	private String nombre;
	private int codResponsable;
	
	//Constructor sin parametrizar
	public Departamento() {
		
	}
	
	//Constructor que recibe todos los parámetros
	public Departamento(int codigo, String nombre, int codResponsable) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.codResponsable = codResponsable;
	}
	
	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodResponsable() {
		return codResponsable;
	}

	public void setCodResponsable(int codResponsable) {
		this.codResponsable = codResponsable;
	}
	
	//Método toString()
	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre + ", codResponsable=" + codResponsable + "]";
	}
}