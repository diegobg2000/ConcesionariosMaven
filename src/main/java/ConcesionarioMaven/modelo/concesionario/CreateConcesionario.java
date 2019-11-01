package ConcesionarioMaven.modelo.concesionario;

import javax.persistence.EntityManager;

import ConcesionarioMaven.negocio.ConcesionarioBean;
import ConcesionarioMaven.util.ConnectionEntityManagerFactory;

/**
 * Clase que inserta alumnos en la base de datos
 * @author Diego
 */
public class CreateConcesionario {
	
	public void create(ConcesionarioBean concesionario) {
		//Recoje la conexion
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction()/*Retorna un recurso de Entity Manager Object. Es un commit*/.begin();//Preparacion de los objetos de la clase Start 
		entityManager.persist(concesionario);//Fabrica la instacia y al persistencia. Introduce lo que fue a buscar a la clase start antes
		entityManager.getTransaction().commit();/*Comprueban si esta bien los datos por ejemplo que no se dupliquen la primary key. Si todo esta bien retorna true*/
		entityManager.close();
	}
}
