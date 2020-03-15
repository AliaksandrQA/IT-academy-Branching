package by.epam.course.branching;

/* Определить, делителем каких чи�?ел а, b, �? �?вл�?ет�?�? чи�?ло k. */  

public class BranchingTask20 {

	public static void solution() {
		
		
		int a;
		int b;
		int c;
		int k;
		
		a = 3;
		b = 1;
		c = 2;
		k = 2;
		
		if (a % k == 0) {
            System.out.println("Чи�?ло " + k + " �?вл�?ет�?�? делителем чи�?ла " + a);
        }
        if (b % k == 0) {
            System.out.println("Чи�?ло " + k + " �?вл�?ет�?�? делителем чи�?ла " + b);
        }
        if (c % k == 0) {
            System.out.println("Чи�?ло " + k + " �?вл�?ет�?�? делителем чи�?ла " + c);
        }

	}
}
