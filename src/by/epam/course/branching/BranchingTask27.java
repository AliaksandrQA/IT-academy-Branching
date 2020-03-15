package by.epam.course.branching;

/* �?айти max{min(a, b), min(c, d)}.*/

public class BranchingTask27 {

	public static void solution() throws java.io.IOException {
		double a;
		double b;
		double c;
		double d;
		
		double x;
		double y;
		double z;
		
		
		a = 37;
		b = 59;
		c = 11;
		d = 17;
		
		x = Math.min(a, b); // находим меньшее (a ,b)
		y = Math.min(c, d); // находим меньшее (c ,d)
		z = Math.max(x, y); // из меньших находим бОльшее  
	}
}