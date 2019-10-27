import java.util.LinkedList;

public class Projektplan {
	
	static int numb;
	LinkedList<Teilaufgabe> liste = new LinkedList<Teilaufgabe>();

	
	public Projektplan(LinkedList<Teilaufgabe> l) {
		liste = l;
		
	
	}
	
	public void addTask(Teilaufgabe t) {
		liste.add(t.getNr(),t);
	}
	

	
	
	
	public void outPlan() {
		
		
		int k = 0;
		while(k < liste.size()) {
			System.out.println("v = "+liste.get(k).getNr()+" - t = "+liste.get(k).getTime()+" - src: "+liste.get(k).getSrc()+" - dest: "+liste.get(k).getDest());
			k++;
			
		}
		
		
		
	
	}
	
	public void outTotalTime() {
		double total = 0;
		int k = 0;
		while(k < liste.size()) {
			total += liste.get(k).getTime();
			k++;
			
		}
		System.out.println(total);
		
	}
	
	
	
	
}
