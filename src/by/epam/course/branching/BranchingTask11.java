package by.epam.course.branching;

// Со�?тавить программу, котора�? определит площадь какого треугольника больше.

public class BranchingTask11 {
	
	public static void solution () {
		
		int a,b,c,d,e,f;
		int p1;
		int p2;
		double s1;
		double s2;
		
		a = 3;
		b = 3;
		c = 3;
		
		d = 4;
		e = 4;
		f = 4;
		
		
		 p1 = (a + b + c) / 2;
	     p2 = (d + e + f) / 2;
		
	      s1 = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
	      s2 = Math.sqrt(p2 * (p2 - d) * (p2 - e) * (p2 - f));
	      
	      
	      if ( s1 < s2) {
	    	  System.out.println("Площадь треугольника 1 меньше площади треугольника 2");
	      } else {
	    	  System.out.println("Площадь треуголька 2 меньше площади треугольника 1");
	      }
	}

}
