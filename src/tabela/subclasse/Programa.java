package tabela.subclasse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
	public static void main(String[] args) {
		A_vo3 a = new A_vo3();
		B_vo3 b = new B_vo3();
		C_vo3 c = new C_vo3();
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		a.setNome("a");
		em.persist(a);
		
		em.getTransaction().commit();;
	}
}
