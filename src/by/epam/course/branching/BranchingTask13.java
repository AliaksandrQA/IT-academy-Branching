package by.epam.course.branching;

/*Даны две точки �?(х1, у1) и В(х2, у2). Со�?тавить алгоритм, определ�?ющий, котора�? из точек находит�?�? ближе к
началу координат. */

public class BranchingTask13 {
	
	public static void solution () {
		
		double x1;
		double y1;
		double x2;
		double y2;
		double length1;
		double length2;
		
		
		x1 = 3.0;
		y1 = - 2.0;
		x2 = 1.0;
		y2 = 2.5;
		
		length1 = Math.sqrt(Math.pow(x1, 2) + (Math.pow(y1, 2)));
		length2 = Math.sqrt(Math.pow(x2, 2) + (Math.pow(y2, 2)));
		
		if (length1 < length2) {
			System.out.println("Точка (" + x1 + ", " + y1 + ") ближе к началу координат, чем точка (" + x2 + ", " + y2 + ")");
		} 
		else {
			System.out.println("Точка (" + x1 + ", " + y1 + ") дальше от начала координат, чем точка (" + x2 + ", " + y2 + ")");
		}
	}

}
