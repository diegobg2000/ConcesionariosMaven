package ConcesionarioMaven.inicio;

import ConcesionarioMaven.modelo.categoria.CreateCategoria;
import ConcesionarioMaven.modelo.coche.CreateCoche;
import ConcesionarioMaven.modelo.concesionario.CreateConcesionario;
import ConcesionarioMaven.modelo.reparacion.CreateReparacion;
import ConcesionarioMaven.modelo.taller.CreateTaller;
import ConcesionarioMaven.modelo.trabajador.CreateTrabajador;
import ConcesionarioMaven.negocio.CategoriaBean;
import ConcesionarioMaven.negocio.CocheBean;
import ConcesionarioMaven.negocio.ConcesionarioBean;
import ConcesionarioMaven.negocio.ReparacionBean;
import ConcesionarioMaven.negocio.TallerBean;
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
	
	ConcesionarioBean concesionario3 = new ConcesionarioBean();
	concesionario3.setNombre("Concesionario 3");
	concesionario3.setCIF("23424324432F");
	concesionario3.setLocalidad("Boadilla");
	concesionario3.setProvincia("Madrid");
	concesionario3.setTelefono("2345643456");
	
	ConcesionarioBean concesionario4 = new ConcesionarioBean();
	concesionario4.setNombre("Concesionario 4");
	concesionario4.setCIF("25443565467J");
	concesionario4.setLocalidad("Lugo");
	concesionario4.setProvincia("Galicia");
	concesionario4.setTelefono("4668788643");
	
	
	
	
	
	
	
	
	//Coches
	CocheBean coche1 = new CocheBean();
	coche1.setBastidor("2453657GAHBGF615267HAHANDG");
	coche1.setModelo("Sport");
	coche1.setColor("Negro");
	coche1.setPlazas(2);
	coche1.setCaballos(400);
	coche1.setEjes("Traccion trasera");
	coche1.setPrecioMin(80000);
	
	CocheBean coche2 = new CocheBean();
	coche2.setBastidor("7846373847894859HGFDH");
	coche2.setModelo("Confort");
	coche2.setColor("Rojo");
	coche2.setPlazas(2);
	coche2.setCaballos(250);
	coche2.setEjes("Traccion delantera");
	coche2.setPrecioMin(50000);
	
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
	
	//Talleres
	TallerBean taller1 = new TallerBean();
	taller1.setConcesionario(concesionario1);
	concesionario1.setTaller(taller1);
	
	//Reparacion
	ReparacionBean reparacion1 = new ReparacionBean();
	reparacion1.setMatricula("12345BCF");
	reparacion1.setMarca("Citroen");
	reparacion1.setMdoelo("Sport");
	reparacion1.setColor("Rojo");
	reparacion1.setBastidor("1231234543556467865JDHFT");
	reparacion1.setDescripcion("Ligero golpe en la parte delantera deracha del vehiculo");
	reparacion1.setPresupuesto(300);
	

	//Categorias
	CategoriaBean gerente = new CategoriaBean();
	gerente.setCategoria("Gerente");
	gerente.setPlus(500);
	
	CategoriaBean responsable = new CategoriaBean();
	responsable.setCategoria("Responsable");
	responsable.setPlus(350);
	
	CategoriaBean jefeTaller = new CategoriaBean();
	jefeTaller.setCategoria("Jefe de Taller");
	jefeTaller.setPlus(250);
	
	CategoriaBean mecanico = new CategoriaBean();
	mecanico.setCategoria("Mecaníco");
	mecanico.setPlus(100);
	
	CategoriaBean vendedor = new CategoriaBean();
	vendedor.setCategoria("Vendedor");
	vendedor.setPlus(150);
	
	CategoriaBean aprendiz = new CategoriaBean();
	aprendiz.setCategoria("Aprendiz");
	aprendiz.setPlus(0);
	
	

	
	
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

	//Persistimos categorias
	CreateCategoria createCategoria = new CreateCategoria();
	createCategoria.create(gerente);
	createCategoria.create(responsable);
	createCategoria.create(jefeTaller);
	createCategoria.create(mecanico);
	createCategoria.create(vendedor);
	createCategoria.create(aprendiz);
	//USO DEL METODO addTrabajador()
	gerente.addTrabajadorCategoria(trabajador1);

	//Persistimos coches
	CreateCoche createCoche = new CreateCoche();
	createCoche.create(coche1);
	createCoche.create(coche2);
	
	//Persistimos trabajadores
	CreateTrabajador createTrabajador = new CreateTrabajador();
	createTrabajador.create(trabajador1);



	/*	
	 * concesionario1.addTraFbajador(trabajador1);
	 * Con esta linea aqui los id se ordenan de forma correcta pero no relaciona la tabla
	 */
	
	
	//USO DEL METODO addReparacion()
	taller1.addReparacion(reparacion1);
		
	//Persistimos reparaciones
	CreateReparacion createReparacion = new CreateReparacion();
	createReparacion.create(reparacion1);


	
	

	
	//USO DEL METODO addConcesionario()
	//taller1.addConcesionario(concesionario1);
	

	

	
	

	}

}
