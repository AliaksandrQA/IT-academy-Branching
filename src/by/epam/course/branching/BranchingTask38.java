package by.epam.course.branching;

/*38. Вычи�?лить значение функции: */


public class BranchingTask38 {
	
	public static void solution() {
		
		double x;
		double y;
		
		x = 11;
		
		if(x >= 0 && x <= 3) {
			
			y = Math.pow(x, 2);
			
			System.out.println("Значение функции = " + y);
		}
		if(x > 3 && x < 0) {
			
			y = 4;
			
			System.out.println("Значение функции = " + y);
	}

}
}
