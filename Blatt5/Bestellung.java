import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bestellung implements java.io.Serializable{

	protected int bestellungsId;
	protected java.sql.Date zeitpunkt;
	
	
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int getBestellungsId() {
		return bestellungsId;
	}
	
	public void setBestellungsId(int id) {
		bestellungsId =  id;
	}
	
	public java.sql.Date getId() {
		return zeitpunkt;
	}
	
	public void setZeitpunkt(java.sql.Date t) {
		zeitpunkt =  t;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="bestellung")
	public Bestellung(Kunde k, Pizza p) {
		new Bestellung(k,p);
	}
	
	
	
	
	
	
	

}