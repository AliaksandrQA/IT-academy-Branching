package by.epam.course.branching;
/* Даны дей�?твительные чи�?ла а,b,�?. Удвоить �?ти чи�?ла, е�?ли а > b > �?, и заменить их аб�?олютными значени�?ми, е�?ли
�?то не так.*/


public class BranchingTask30 {
	public static void solution() {
		
		int a;
		int b;
		int c;
		
		
		
		a = 3;
		b = 7;
		c = 4;
		
		if ( a > b && b > c) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			
		} System.out.println("Значение a,b,c ="+" "+ " "+ a + b + c);
		
	} 
}
