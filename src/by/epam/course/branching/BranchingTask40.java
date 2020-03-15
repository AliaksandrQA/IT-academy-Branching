package by.epam.course.branching;

/*40. Вычи�?лить значение функции: */

public class BranchingTask40 {
	public static void solution() {
		
		double x;
		double y;
		
		x = 13;
		
		if(x <= 13) {
			
			y = - Math.pow(x, 3) + 9;
			
			System.out.println("Значение функции = " + y);
		}
		
		if(x > 13) {
			
			y = -(3 / (x + 1));
			
			System.out.println("Значение функции = " + y);
		}
	}

}
