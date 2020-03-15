package by.epam.course.branching;

/* Даны два угла треугольника (в граду�?ах). Определить, �?уще�?твует ли такой треугольник, и е�?ли да, то будет ли он
пр�?моугольным. */

public class BranchingTask14 {

	public static void solution () {
		
		int corner1;
		int corner2;
		int corner3;
		
		corner1 = 70;
		corner2 = 30;
		
		corner3 = 180 - corner1 - corner2;
		
		if (corner1 > 0 && corner2 > 0 && corner3 > 0 ) {
			System.out.println("Треугольник �?уще�?твует");
		} 
		if (corner1 == 90 || corner2 == 90 || corner3 ==90) {
			 System.out.println("Треугольник пр�?моугольный");
			 
		} else {System.out.println("Треугольник не пр�?моугольный");
		
		}
}
}
