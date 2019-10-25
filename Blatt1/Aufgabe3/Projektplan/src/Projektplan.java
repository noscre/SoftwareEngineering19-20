import java.util.LinkedList;

public class Projektplan {
	
	static int numb;
	LinkedList<Teilaufgabe[][]> liste = new LinkedList<Teilaufgabe[][]>();
	
	
	public Projektplan(LinkedList<Teilaufgabe[][]> l) {
		liste = l;
		
	}
	

	
	
	
	public void outPlan() {
		
		
		int k = 0;
		while(!liste.isEmpty()) {

		
		for (int i = 0; i < liste.get(k).length; i++) {
			for (int j = 0; j <liste.get(k)[i].length; j++) {
			
				System.out.println("v="+liste.get(k)[i][j].getNr()+", t="+liste.get(k)[i][j].getTime()+", von Aufgabe:"+liste.get(k)[i][j].getRef());
			
			}
			
		

		}
		k++;
		}
		
	
	}
	
	
	
	
}
