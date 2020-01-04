import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pizza implements java.io.Serializable{

	protected int pizzaId;
	protected double preis;
	protected String name;
	
	
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int getPizzaId() {
		return pizzaId;
	}
	
	public void setPizzaId(int id) {
		pizzaId =  id;
	}
	
	public double getPreis() {
		return preis;
	}
	
	public void setPreis(double t) {
		preis =  t;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name =  n;
	}
	
	
	
	
	
	
	
	

}