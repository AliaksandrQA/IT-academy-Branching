package by.epam.course.branching;

//  Со�?тавить программу нахождени�? наименьшего из квадратов двух чи�?ел а и b.

public class BranchingTask8 {
	
	public static void solution () {
		
		
		double a;
		double b;
		
		a = 2;
		b = 3;
		
		a = Math.pow(a, 3);
		b = Math.pow(b, 3);
		
		if (a < b) {
			System.out.println("Квадрат а меньше квадрата б");
		} 
		else { 
			System.out.println("Квадрат б меньше квадрата б");

		}
	}
		

}
