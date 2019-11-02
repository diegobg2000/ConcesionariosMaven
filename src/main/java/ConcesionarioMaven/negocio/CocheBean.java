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
import javax.persistence.Table;

@Entity
@Table(name = "Coche")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CocheBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idCoche;
	
	@Column
	private String bastidor;
	
	@Column
	private String modelo;
	
	@Column
	private String color;
	
	@Column
	private int plazas;
	
	@Column
	private int caballos;
	
	@Column
	private String ejes; //Traccion delantera || Traccion trasera || Traccion total 
	
	@Column
	private int precioMin;
	
	
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<ConcesionarioBean> concesionarios = new ArrayList<ConcesionarioBean>();
	
	public List<ConcesionarioBean> getConcesionarios() {
		return concesionarios;
	}
	/*
	 	¿?¿?¿?¿?¿?¿?
	 */
	public void setConcesionarios(List<ConcesionarioBean> concesionarios) {
		this.concesionarios = concesionarios;
	}
	
	//Getters y Setters
	
	public long getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(long idCoche) {
		this.idCoche = idCoche;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public String getEjes() {
		return ejes;
	}

	public void setEjes(String ejes) {
		this.ejes = ejes;
	}

	public int getPrecioMin() {
		return precioMin;
	}

	public void setPrecioMin(int precioMin) {
		this.precioMin = precioMin;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	
	
}
