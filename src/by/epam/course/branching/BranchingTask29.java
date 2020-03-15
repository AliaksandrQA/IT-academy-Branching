package by.epam.course.branching;

// Даны три точки �?(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они ра�?положены на одной пр�?мой.

public class BranchingTask29 {

	public static void solution() {
		
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		
		x1 = 9;
		x2 = 11;
		x3 = 10;
		y1 = 8;
		y2 = 2;
		y3 = 8;
		if((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3)) {
			System.out.println("три точки ра�?положены на одной пр�?мой");
		} else {
			
			System.out.println("три точки не ра�?положены на одной пр�?мой");
		}

	}
	
}
