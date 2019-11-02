package ConcesionarioMaven.inicio;

import ConcesionarioMaven.modelo.coche.CreateCoche;
import ConcesionarioMaven.modelo.concesionario.CreateConcesionario;
import ConcesionarioMaven.modelo.trabajador.CreateTrabajador;
import ConcesionarioMaven.negocio.CocheBean;
import ConcesionarioMaven.negocio.ConcesionarioBean;
import ConcesionarioMaven.negocio.TrabajadorBean;

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
	
	//Trabajadores
	TrabajadorBean trabajador1 = new TrabajadorBean();
	trabajador1.setNombre("Diego");
	trabajador1.setApellidos("Bascuas Gutiérrez");
	trabajador1.setDNI("123456789B");
	trabajador1.setDirecion("Calle1");
	trabajador1.setLocalidad("Oviedo");
	trabajador1.setPrrovincia("Asturias");
	trabajador1.setTelefono(123456789);
	trabajador1.setSueldoBase(2500);
	
	
	
	
	/***********************
	 * PERSISTIMOS LOS DATOS
	 ***********************/
	

	
		
	//Persistimos concesionarios
	CreateConcesionario createConcesionario = new CreateConcesionario();
	createConcesionario.create(concesionario1);
	createConcesionario.create(concesionario2);
	
	//USO DEL METODO addTrabajador()
	concesionario1.addTrabajador(trabajador1);
	
	//USO DEL METODO addCoche()
	concesionario1.addCoche(coche1);

	

	//Persistimos coches
	CreateCoche createCoche = new CreateCoche();
	createCoche.create(coche1);
	
	//Persistimos trabajadores
	CreateTrabajador createTrabajador = new CreateTrabajador();
	createTrabajador.create(trabajador1);
	/*	
	 * concesionario1.addTrabajador(trabajador1);
	 * Con esta linea aqui los id se ordenan de forma correcta pero no relaciona la tabla
	 */

	}

}
