package by.epam.course.branching;

// Со�?тавить программу нахождени�? модул�? выражени�? a*x*x + b*x + c при заданных значени�?х a, b, c и х

public class BranchingTask7 {

	public static void solution () {
		
		
		int a;
		int b;
		int c;
		int x;
		int result;
		
		a = 3;
		b = 7;
		c = 2;
		x = - 1;
		
		result = a *x * x + b * x +c;
		
		if ( result < 0) {
			
			result = Math.abs(result);
			System.out.println(result);
		} else {
			
			System.out.println("???");
		}
		
		
		
	}
}
