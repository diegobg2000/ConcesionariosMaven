package ConcesionarioMaven.negocio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name= "Trabajadores")
	@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
	public class TrabajadorBean {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idTrabajado;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String DNI;
	
	@Column
	private String direcion;
	
	@Column
	private String localidad;
	
	@Column
	private String prrovincia;
	
	@Column
	private int telefono;
	
	@Column
	private int sueldoBase;
	
	
	/***********************************
	 	RELACION DE LAS TABLAS
	 ***********************************/
	@ManyToOne(cascade = CascadeType.MERGE)
	private ConcesionarioBean concesionario;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private CategoriaBean categoria;
	
	
	/***********************************
	 	GETTERS AND SETTERS
	 ***********************************/
	
	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}
	public CategoriaBean getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaBean categoria) {
		this.categoria = categoria;
	}
	public void setConcesionario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}
	public long getIdTrabajado() {
		return idTrabajado;
	}
	
	public void setIdTrabajado(long idTrabajado) {
		this.idTrabajado = idTrabajado;
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
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getDirecion() {
		return direcion;
	}
	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getPrrovincia() {
		return prrovincia;
	}
	public void setPrrovincia(String prrovincia) {
		this.prrovincia = prrovincia;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	
}
