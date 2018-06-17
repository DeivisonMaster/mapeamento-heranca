package tabela.classe.concreta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
	public static void main(String[] args) {
		A_vo2 a = new A_vo2();
		B_vo2 b = new B_vo2();
		C_vo2 c = new C_vo2();
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		a.setNome("a");
		em.persist(a);
		
		em.getTransaction().commit();;
	}
}
