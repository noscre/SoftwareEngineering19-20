

public class Teilaufgabe{
	
	private int nr;
	private double time;

	private int src;
	private int dest;
	public Teilaufgabe(int n, double t, int p, int d) {

		nr = n;
		time = t;
		src = p;
		dest = d;

		
	}
	
	
	
	
	
	public int getSrc() {
		return src;
	}
	
	
	public int getDest() {
		return dest;
	}
	
	public int getNr() {
		return nr;
	}
	
	public double getTime() {
		return time;
		
	}
	
	
	

	
	
}
