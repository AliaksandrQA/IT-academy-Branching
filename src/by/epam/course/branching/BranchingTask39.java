package by.epam.course.branching;

/*39. Вычи�?лить значение функции: */

public class BranchingTask39 {
	public static void solution() {
		
		
		double x;
		double y;
		
		x = 7;
		
		if(x >= 8) {
			
			y = - Math.pow(x, 2) + x - 9;
			
			System.out.println("Значение функции = " + y);
		}
		if(x < 8) {
			
			y = 1 / (Math.pow(x, 4) - 6);
			
			System.out.println("Значение функции = " + y);
		}
	}
}
