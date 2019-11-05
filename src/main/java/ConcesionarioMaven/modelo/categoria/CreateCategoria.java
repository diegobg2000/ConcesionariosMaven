package ConcesionarioMaven.modelo.categoria;

import javax.persistence.EntityManager;

import ConcesionarioMaven.negocio.CategoriaBean;
import ConcesionarioMaven.util.ConnectionEntityManagerFactory;

public class CreateCategoria {
	public void create(CategoriaBean categoria) {
	EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(categoria);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
