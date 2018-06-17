package tabela.unica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
	public static void main(String[] args) {
		A_vo1 a = new A_vo1();
		B_vo1 b = new B_vo1();
		C_vo1 c = new C_vo1();
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		a.setNome("a");
		em.persist(a);
		
		em.getTransaction().commit();;
	}
}
