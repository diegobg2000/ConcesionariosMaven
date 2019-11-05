package ConcesionarioMaven.negocio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "reparaciones")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ReparacionBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idReparacion;
	
	@Column
	private String matricula;
	
	@Column
	private String marca;
	
	@Column
	private String mdoelo;
	
	@Column
	private String color;
	
	@Column
	private String bastidor;
	
	@Column
	private String descripcion;
	
	@Column
	private int presupuesto;
	
	
	
	
	/*********************************************************
	 	RELACIONES ENTRE TABLAS
	************************************************************/
	@ManyToOne
	private TallerBean taller;
		
	
	
	/***************************
	 	GETTERS AND SETTERS
	 *************************/
	
	public long getIdReparacion() {
		return idReparacion;
	}

	public TallerBean getTaller() {
		return taller;
	}

	public void setTaller(TallerBean taller) {
		this.taller = taller;
	}

	public void setIdReparacion(long idReparacion) {
		this.idReparacion = idReparacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMdoelo() {
		return mdoelo;
	}

	public void setMdoelo(String mdoelo) {
		this.mdoelo = mdoelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	
}
