package ConcesionarioMaven.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity		//Para indicarle al JPA que este objeto va a ser una entidad en la BD
@Table(name = "concesionario")		//Le indicamos que esta entidad tiene que generar tabla y le damos nombre
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)	//ESCRIBIR...
public class ConcesionarioBean {
	
	/****************************************************
	 * DECLARACION DE ATRRIBUTOS Y DEFINICION DE LA TABLA
	 ****************************************************/
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column
	private long idConcesionario;
	
	@Column
	private String nombre;
	
	@Column
	private String CIF;
	
	@Column
	private String localidad;
	
	@Column
	private String provincia;
	
	@Column
	private String telefono;
	
	
	
	
	
	/***********************
	 * SETERS AND GETERS
	 ***********************/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
