package ConcesionarioMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@ManyToMany(mappedBy = "concesionarios", cascade = CascadeType.ALL)
	private List<CocheBean> coches = new ArrayList<CocheBean>();
	
	
	/**********************************************
	 * METODOS PARA AÑADIR LOS OBJETOS A LAS LISTAS
	 * Operacion que permite añadir coches al concesionario y este concesionario a la lista de coches
	 **********************************************/
	public void addCoche(CocheBean coche) {
		if(!coches.contains(coche)) {
			coches.add(coche);
		
			//Hay que indicarle al coche que añada este concesionario a su lista
			List<ConcesionarioBean> concesionarios = coche.getConcesionarios();
			/*
			 A�ade a la lista "concesionarios el coche que se esta añadiendo con el metodo addCoche, 
			 para ello en el siguiente if comprueba que este coche no haya sido añadido a la lista anteriormente
			 */
			if(!concesionarios.contains(this)) {
				concesionarios.add(this);
				
			}
		}
		
	}
	
	
	@OneToMany(mappedBy = "concesionario", cascade=CascadeType.ALL)
	private List<TrabajadorBean> trabajadores = new ArrayList<TrabajadorBean>();
	
	
	public void addTrabajador(TrabajadorBean trabajador) {
		if(!trabajadores.contains(trabajador)) {
			trabajadores.add(trabajador);
			//Vinculamos a este trabajador con su concesionario
			trabajador.setConcesionario(this);
		}
	}
	
	/*
	@ManyToOne
	private TallerBean taller;
	*/
	/***********************
	 * SETERS AND GETERS
	 ***********************/
	
	
	public String getNombre() {
		return nombre;
	}
//	public TallerBean getTaller() {
//		return taller;
//	}
//	public void setTaller(TallerBean taller) {
//		this.taller = taller;
//	}
	public long getIdConcesionario() {
		return idConcesionario;
	}
	public void setIdConcesionario(long idConcesionario) {
		this.idConcesionario = idConcesionario;
	}
	public List<CocheBean> getCoches() {
		return coches;
	}
	public void setCoches(List<CocheBean> coches) {
		this.coches = coches;
	}
	public List<TrabajadorBean> getTrabajadores() {
		return trabajadores;
	}
	public void setTrabajadores(List<TrabajadorBean> trabajadores) {
		this.trabajadores = trabajadores;
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
