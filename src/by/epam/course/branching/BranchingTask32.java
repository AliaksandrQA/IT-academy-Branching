package by.epam.course.branching;

/*�?апи�?ать программу, котора�? по заданным трем чи�?лам определ�?ет, �?вл�?ет�?�? ли �?умма каких-либо двух из них
положительной. */ 

public class BranchingTask32 {
	public static void solution() {
		
		
		int a;
		int b;
		int c;
		int sum1;
		int sum2;
		int sum3;
		
		a = - 107;
		b = 3;
		c =  6;
		
		sum1 = a + b;
		sum2 = a + c;
		sum3 = b + c;
		
		if ( sum1 < 0 || sum2 < 0 || sum3 < 0){
			System.out.println("Сумма двух чи�?ел не �?вл�?ет�?�? положительной");
		} else {
			System.out.println("Сумма двух чи�?ел  �?вл�?ет�?�? положительной");
		}
		
	}
}
