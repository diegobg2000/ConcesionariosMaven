package ConcesionarioMaven.modelo.coche;

import javax.persistence.EntityManager;

import ConcesionarioMaven.negocio.CocheBean;
import ConcesionarioMaven.util.ConnectionEntityManagerFactory;

public class CreateCoche {
	
	public void create(CocheBean coche){
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(coche);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
