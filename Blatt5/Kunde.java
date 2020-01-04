import javax.persistence.*;

@Entity
public class Kunde implements java.io.Serializable{

	protected String name;
	protected String kundenId;
	
	
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name =  n;
	}
	
	public String getId() {
		return kundenId;
	}
	
	public void setId(String id) {
		kundenId =  id;
	}
	
	
	
	
	
	
	

}
