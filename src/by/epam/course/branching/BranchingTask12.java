package by.epam.course.branching;

/* Даны три дей�?твительных чи�?ла. Возве�?ти в квадрат те из них, значени�? которых неотрицательны, и в четвертую
�?тепень — отрицательные.*/

public class BranchingTask12 {
	public static void solution () {
		
		double a;
		double b;
		double c;
		
		a = 2.0;
		b = - 3.0;
		c = - 5.0;
		
		if ( a >= 0) {
			a = Math.pow(a, 2);
		} else {
			a = Math.pow(a, 4);
		}
		
		if ( b >= 0) {
			b = Math.pow(b, 2);
		} else {
			b = Math.pow(b, 4);
		}
		
		if ( c >= 0) {
			c = Math.pow(c, 2);
		} else {
			c = Math.pow(c, 4);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
