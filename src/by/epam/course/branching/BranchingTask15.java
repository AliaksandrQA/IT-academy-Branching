package by.epam.course.branching;

/* Даны дей�?твительные чи�?ла х и у, не равные друг другу. Меньшее из �?тих двух чи�?ел заменить половиной их
�?уммы, а большее — их удвоенным произведением.*/

public class BranchingTask15 {

	public static void solution () {
		
		double x;
		double y;
		
		x = 7;
		y = 9;
		
		if ( x < y) {
			x = (x + y)/2;
			y = (y * x)*2;
				
		} 
		else {
			x = (x + y)/2;
			y = (y * x)*2;
		}
		
		System.out.println("Меньшее из �?тих двух чи�?ел = "+" "+ x);
		System.out.println("Большее из �?тих двух чи�?ел = "+" "+ y);
	}
}
