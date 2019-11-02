package ConcesionarioMaven.modelo.trabajador;

import javax.persistence.EntityManager;

import ConcesionarioMaven.negocio.TrabajadorBean;
import ConcesionarioMaven.util.ConnectionEntityManagerFactory;

public class CreateTrabajador {
	
	public void create(TrabajadorBean trabajador) {
	EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(trabajador);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
