package by.epam.course.branching;

/* Под�?читать количе�?тво положительных �?реди чи�?ел а, b, �?. */

public class BranchingTask19 {

	public static void solution() {

		int a;
		int b;
		int c;
		int count;

		a = -35;
		b = -29;
		c = -1;
		count = 0;

		if (a > 0) {
			count++;
		}
		if (b > 0) {
			count++;

		}
		if (c > 0) {
			count++;
		}
		System.out.println("количе�?тво положительных чи�?ел = " + " " + count);
	}
}
