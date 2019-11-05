package ConcesionarioMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CategoriaBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idCategoria;
	
	@Column
	private String categoria;
	
	@Column
	private int plus;
	
	@OneToMany(mappedBy = "categoria")
	private List<TrabajadorBean> trabajadores = new ArrayList<TrabajadorBean>();
		
		public void addTrabajadorCategoria(TrabajadorBean trabajador) {
			if(!trabajadores.contains(trabajador)){
				trabajadores.add(trabajador);
				trabajador.setCategoria(this);
				
			}
		}

	
	/*
	 	GETTERS AND SETTERS
	 * */
	
	public long getIdCategoria() {
		return idCategoria;
	}

	public List<TrabajadorBean> getTrabajadores() {
		return trabajadores;
	}


	public void setTrabajadores(List<TrabajadorBean> trabajadores) {
		this.trabajadores = trabajadores;
	}


	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}	

	
	
}

