package by.epam.course.branching;
/*36. Вычи�?лить значение функции: */


public class BranchingTask36 {
	
	public static void solution() {
		double x;
		double y;
		
		x = 5;
		
		if(x <= 3) {
			
			y = Math.pow(x, 2) -  (3 * x) + 9;
			
			System.out.println("Значение функции = " + y);
		}
		if(x > 3) {
			
			y = 1 / (Math.pow(x, 3) + 6);
			
			System.out.println("Значение функции = " + y);
		}
		
		
	}

}
