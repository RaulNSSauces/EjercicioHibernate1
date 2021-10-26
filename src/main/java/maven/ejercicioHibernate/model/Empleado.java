package maven.ejercicioHibernate.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Empleado implements Serializable {
	
	//Declaración de variables
	private int codigo;
	private String nombre;
	private String ape1;
	private String ape2;
	private String lugar_nac;
	private String fecha_nac;
	private String direccion;
	private String tel;
	private String puesto;
	private int cod_departamento;
	
	//Constructor sin parametrizar
	public Empleado() {
		
	}
	
	//Constructor que recibe todos los parámetros
	public Empleado(int codigo, String nombre, String ape1, String ape2, String lugar_nac, String fecha_nac,
			String direccion, String tel, String puesto, int cod_departamento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.lugar_nac = lugar_nac;
		this.fecha_nac = fecha_nac;
		this.direccion = direccion;
		this.tel = tel;
		this.puesto = puesto;
		this.cod_departamento = cod_departamento;
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

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String getLugar_nac() {
		return lugar_nac;
	}

	public void setLugar_nac(String lugar_nac) {
		this.lugar_nac = lugar_nac;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getCod_departamento() {
		return cod_departamento;
	}

	public void setCod_departamento(int cod_departamento) {
		this.cod_departamento = cod_departamento;
	}
	
	//Método toString()
	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2
				+ ", lugar_nac=" + lugar_nac + ", fecha_nac=" + fecha_nac + ", direccion=" + direccion + ", tel=" + tel
				+ ", puesto=" + puesto + ", cod_departamento=" + cod_departamento + "]";
	}
}