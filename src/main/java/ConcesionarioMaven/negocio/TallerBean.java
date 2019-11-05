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
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "talleres")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE )
public class TallerBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idTaller;
	
	

	
	
	
	/*********************************************************
 	RELACIONES ENTRE TABLAS
************************************************************/
	@OneToOne(mappedBy = "taller")
//	@JoinColumn(name = "FK_concesionario")
	private ConcesionarioBean concesionario;
//	@OneToMany(mappedBy = "taller", cascade=CascadeType.ALL)
//	private List<ConcesionarioBean> concesionarios = new ArrayList<ConcesionarioBean>();
//	
//	public void addConcesionario(ConcesionarioBean concesionario) {
//			
//		if(!concesionarios.contains(concesionario)) {
//			concesionarios.add(concesionario);
//			concesionario.setTaller(this);
//			System.out.println("Se acabo de ejecutar el metodo addConcesionario");
//		}
//		
//	}
	
	@OneToMany(mappedBy  = "taller",  cascade=CascadeType.ALL)
	private List<ReparacionBean> reparaciones = new ArrayList<ReparacionBean>();
	
	public void addReparacion(ReparacionBean reparacion) {
		if(!reparaciones.contains(reparacion)) {
			reparaciones.add(reparacion);
			reparacion.setTaller(this);
			System.out.println("Se acabo de ejecutar el metodo addReparacion");

		}
	}


	
	
	/*************************
	 	GETTERS AND SETTERS
	 **************************/
	
	public long getIdTaller() {
		return idTaller;
	}

	public List<ReparacionBean> getReparaciones() {
		return reparaciones;
	}




	public void setReparaciones(List<ReparacionBean> reparaciones) {
		this.reparaciones = reparaciones;
	}

	public void setIdTaller(long idTaller) {
		this.idTaller = idTaller;
	}




	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}




	public void setConcesionario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}

//	public List<ConcesionarioBean> getConcesionarios() {
//		return concesionarios;
//	}
//
//	public void setConcesionarios(List<ConcesionarioBean> concesionarios) {
//		this.concesionarios = concesionarios;
//	}
//	
	
}