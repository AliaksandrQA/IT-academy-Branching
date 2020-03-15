package by.epam.course.branching;

/* Даны три чи�?ла a, b, �?. Определить, какое из них равно d. Е�?ли ни одно не равно d, то найти max(d — a, d — b, d —
c).*/

public class BranchingTask28 {

	public static void solution() {
		
		int a;
		int b;
		int c;
		int d;
		int tempx;
		int tempy;
		int tempz;
		
		a = 3;
		b = 7;
		c = 9;
		d = 15;
		
		if (a == d || b ==d || c ==d) {
				if(a == d) {
				
				System.out.println(" a равно d");
			}
			if(b == d) {
				
				System.out.println(" b равно d");
			}
			if(c == d) {
				
				System.out.println(" c равно d");
			}
		}
		else {
			tempx = d - a;
			tempy = d - b;
			tempz = d - c;
			
			int s;
			int q;
			
			if(tempx > tempy){  
				s = tempx;
			}
			else{
				s = tempy;
			}
			if(s > tempz){
				q = s;
			}
			else{
				q = tempz;
			}
		} System.out.println("Значение d =" + " "+ d);
		
	}
	
}
