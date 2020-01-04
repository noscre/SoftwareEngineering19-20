

import javax.management.Query;
import javax.persistence.*;

@PermitAll
@Stateless
public class Bestellservice {
	@PersistenceContext
	private EntityManager em;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void erstelleBestellung(Kunde k, Pizza p) {
		
		Bestellung b = new Bestellung(k,p);
		
		em.persist(b);

		//nötig?
		javax.persistence.Query q = em.createQuery("Select count(*) from Kunde k where k.name = :n");
		q.setParameter("n", k);
		
	
	}
}
