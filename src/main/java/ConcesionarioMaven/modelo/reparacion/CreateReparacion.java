package ConcesionarioMaven.modelo.reparacion;

import javax.persistence.EntityManager;

import ConcesionarioMaven.negocio.ReparacionBean;
import ConcesionarioMaven.util.ConnectionEntityManagerFactory;

public class CreateReparacion {
	public void create(ReparacionBean reparacion) {
	EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(reparacion);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
	