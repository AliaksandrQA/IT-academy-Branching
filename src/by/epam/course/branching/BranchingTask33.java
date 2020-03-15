package by.epam.course.branching;

/* �?апи�?ать программу, котора�? по паролю будет определ�?ть уровень до�?тупа �?отрудника к �?екретной информации в
базе данных. До�?туп к базе имеют только ше�?ть человек, разбитых на три группы по �?тепени до�?тупа. Они имеют
�?ледующие пароли: 9583, 1747 — до�?тупны модули баз �?, В, С; 3331, 7922 — до�?тупны модули баз В, С; 9455, 8997 —
до�?тупен модуль базы С.*/

public class BranchingTask33 {

	public static void solution() {

		
		double highAccess1;
		double highAccess2;
		double midAcess1;
		double midAcess2;
		double lowAcess1;
		double lowAcess2;
		double temp1;
		double temp2;
		double temp3;
		
		highAccess1 = 9583;
		highAccess2 = 1747;
		midAcess1 = 3331;
		midAcess2 = 7922;
		lowAcess1 = 9455;
		lowAcess2 = 8997;
		
		temp1 = 9583;
		temp2 = 3331;
		temp3 = 8997;
		
		if(temp1 == highAccess1 || temp1 == highAccess1) {
			System.out.println("До�?туп к базам �?, В, С открыт");
		}
		else if (temp2 == midAcess1 || temp2 == midAcess2) {
			System.out.println("До�?туп к базам В, С открыт");
		}
		else if (temp3 == lowAcess1 || temp3 == lowAcess1 ) {
	    System.out.println("До�?туп к базе  С открыт");
	
}
		else if ((temp1 != highAccess1 && temp1 !=highAccess2  && temp2 != midAcess1 && temp2 != midAcess2 && temp3 != lowAcess1 && temp3 != lowAcess2)) {
			System.out.println("До�?туп закрыт");
			
		}
	}
}
