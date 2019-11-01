package ConcesionarioMaven.inicio;

import ConcesionarioMaven.modelo.concesionario.CreateConcesionario;
import ConcesionarioMaven.negocio.ConcesionarioBean;

public class Start {
	public static void main(String[] args) {
		/*******************
		 * CREAMOS LOS DATOS
		 ********************/
	ConcesionarioBean concesionario1 = new ConcesionarioBean();
	concesionario1.setNombre("Concesionario 1");
	concesionario1.setCIF("123123123B");
	concesionario1.setLocalidad("Oviedo");
	concesionario1.setProvincia("Asturias");
	concesionario1.setTelefono("123456789");
	
	ConcesionarioBean concesionario2 = new ConcesionarioBean();
	concesionario2.setNombre("Concesionario 2");
	concesionario2.setCIF("7612312763H");
	concesionario2.setLocalidad("Barcelona");
	concesionario2.setProvincia("Cataluña");
	concesionario2.setTelefono("14253654");
	
	/***********************
	 * PERSISTIMOS LOS DATOS
	 ***********************/
	CreateConcesionario createConcesionario = new CreateConcesionario();
	createConcesionario.create(concesionario1);
	createConcesionario.create(concesionario2);
	}
}
