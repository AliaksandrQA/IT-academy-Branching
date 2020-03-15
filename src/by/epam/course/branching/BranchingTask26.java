package by.epam.course.branching;

import static java.lang.Math.*;
import java.util.Scanner;

/*�?апи�?ать программу нахождени�? �?уммы большего и меньшего из трех чи�?ел.*/

public class BranchingTask26 {
	public static void solution() throws java.io.IOException {

		Scanner s = new Scanner(System.in);

		int a; 
		int b; 
		int c; 
		
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		int sum = max(max(a, b), c) + min(min(a, b), c);
		System.out.println("Cуммы большего и меньшего из трех чи�?ел"+" "+ sum);
	}
}
