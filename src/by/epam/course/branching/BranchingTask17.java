package by.epam.course.branching;

/*Даны целые чи�?ла т, п. Е�?ли чи�?ла не равны, то заменить каждое из них одним и тем же чи�?лом, равным большему
из и�?ходных, а е�?ли равны, то заменить чи�?ла нул�?ми. */

public class BranchingTask17 {

	public static void solution() {

		int n;
		int m;

		n = 10;
		m = 69;

		if (n != m) {

			if (n > m) {
				m = n;
			} else {
				n = m;
			}
		} else if (n == m) {
			n = 0;
			m = 0;
		}
		System.out.println("Полученные чи�?ла: " + n + ", " + m);
	}
}
