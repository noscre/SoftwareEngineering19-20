import java.util.LinkedList;

public class TestPlan {
	public static void main(String[] args) {
		LinkedList<Teilaufgabe> l = new LinkedList<Teilaufgabe>();
		Teilaufgabe t0 = new Teilaufgabe(0, 10, 0, 1);
		Teilaufgabe t1 = new Teilaufgabe(1, 14, 0, 1);
		Teilaufgabe t2 = new Teilaufgabe(2, 11, 0, 1);
		Teilaufgabe t3 = new Teilaufgabe(3, 19, 1, 2);
		Teilaufgabe t4 = new Teilaufgabe(4, 13, 1, 3);
		Teilaufgabe t5 = new Teilaufgabe(5, 11, 2, 4);
		Teilaufgabe t6 = new Teilaufgabe(6, 16, 1, 4);
		Teilaufgabe t7 = new Teilaufgabe(7, 17, 0, 3);
		Teilaufgabe t8 = new Teilaufgabe(8, 13, 2, 4);
		
		
		l.add(0, t0);
		l.add(1, t1);
		l.add(2, t2);
		l.add(3, t3);
		l.add(4, t4);
		l.add(5, t5);
		l.add(6, t6);
		l.add(7, t7);
		l.add(8, t8);
		
		
		
		Projektplan p = new Projektplan(l);
		p.outPlan();
		p.outTotalTime();

	}
}
