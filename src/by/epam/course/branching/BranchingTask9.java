package by.epam.course.branching;

/*Со�?тавить программу, котора�? определит по трем введенным �?торонам, �?вл�?ет�?�? ли данный треугольник
равно�?торонним. */

public class BranchingTask9 {
	
	public static void solution () {
		int a;
		int b;
		int c;
		
		a = 3;
		b = 4;
		c = 3;
		
		if ( a == b && b == c) {
			System.out.println("Треугольник �?о �?торонами " + a + ", " + b + ", " + c + " �?вл�?ет�?�? равно�?торонним");
		}
		else {
			 System.out.println("Треугольник �?о �?торонами " + a + ", " + b + ", " + c + " не �?вл�?ет�?�? равно�?торонним");
		}
	}
}
