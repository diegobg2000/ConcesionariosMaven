package ConcesionarioMaven.modelo.taller;

import javax.persistence.EntityManager;

import ConcesionarioMaven.negocio.TallerBean;
import ConcesionarioMaven.util.ConnectionEntityManagerFactory;

public class CreateTaller {
	public void create(TallerBean taller) {
	EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(taller);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
