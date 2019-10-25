import java.util.LinkedList;

public class TestPlan {
	public static void main(String[] args) {
		
		
		

		
		Teilaufgabe t1 = new Teilaufgabe(1, 101, "a");
		Teilaufgabe t2 = new Teilaufgabe(2, 102, "a");
		Teilaufgabe t3 = new Teilaufgabe(3, 102, "a");
		Teilaufgabe t4 = new Teilaufgabe(4, 102, "a");
		Teilaufgabe t5 = new Teilaufgabe(5, 102, "a");
		Teilaufgabe t6 = new Teilaufgabe(6, 102, "a");
		Teilaufgabe t7 = new Teilaufgabe(7, 102, "a");
	
		

		

		Teilaufgabe list[][] = new Teilaufgabe[3][6];
		list[0][0] = t1;
		list[1][0] = t2;
		list[2][0] = t3;
		list[2][1] = t4;
		list[2][2] = t5;
		list[2][3] = t6;
		list[2][4] = t7;

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] != null) {
					System.out.println(list[i][j].getNr());
				}else {
					j++;
				}

			}
		}

		
//		Teilaufgabe t11 = new Teilaufgabe(10, 101, "a1");
//		Teilaufgabe t12 = new Teilaufgabe(20, 102, "a1");
//		Teilaufgabe a1[] = new Teilaufgabe[2];
//		a[0] = t11;
//		a[1] = t12;
//
//		
//
//		Teilaufgabe t13 = new Teilaufgabe(13, 103, "b1");
//		Teilaufgabe t14 = new Teilaufgabe(14, 104,"b1");
//		Teilaufgabe b1[] = new Teilaufgabe[2];
//		b[0] = t13;
//		b[1] = t14;
//	
//		
//		Teilaufgabe t15 = new Teilaufgabe(15, 100,"c1");
//		Teilaufgabe t16 = new Teilaufgabe(16, 100,"c1");
//		Teilaufgabe c1[] = new Teilaufgabe[2];
//		c[0] = t15;
//		c[1] = t16;

//
//		
//		Teilaufgabe list1[][] = new Teilaufgabe[3][2];
//		list1[0] = a1;
//		list1[1] = b1;
//		list1[2] = c1;

		LinkedList<Teilaufgabe[][]> l = new LinkedList<Teilaufgabe[][]>();
//	
//		l.add(0,list);
//		l.add(1,list1);

//		
//		Projektplan p = new Projektplan(l);
//		
//		p.outPlan();
	}
}
