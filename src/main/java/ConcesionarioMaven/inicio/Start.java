package ConcesionarioMaven.inicio;

import ConcesionarioMaven.modelo.coche.CreateCoche;
import ConcesionarioMaven.modelo.concesionario.CreateConcesionario;
import ConcesionarioMaven.negocio.CocheBean;
import ConcesionarioMaven.negocio.ConcesionarioBean;

public class Start {
	public static void main(String[] args) {
		/*******************
		 * CREAMOS LOS DATOS
		 ********************/
	//Concesionarios
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
	concesionario2.setProvincia("Cataluna");
	concesionario2.setTelefono("14253654");
	
	
	
	//Coches
	CocheBean coche1 = new CocheBean();
	coche1.setBastidor("2453657GAHBGF615267HAHANDG");
	coche1.setModelo("Sport");
	coche1.setColor("Negro");
	coche1.setPlazas(2);
	coche1.setCaballos(400);
	coche1.setEjes("Traccion trasera");
	coche1.setPrecioMin(80000);	
	
	
	
	/***********************
	 * PERSISTIMOS LOS DATOS
	 ***********************/
	//Persistimos concesionarios
	CreateConcesionario createConcesionario = new CreateConcesionario();
	createConcesionario.create(concesionario1);
	createConcesionario.create(concesionario2);
	
	//Persistimos coches
	CreateCoche createCoche = new CreateCoche();
	createCoche.create(coche1);
	
	
	//USO DEL METODO addCoche()
	concesionario1.addCoche(coche1);
	
	}

}
