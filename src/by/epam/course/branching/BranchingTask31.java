package by.epam.course.branching;

/*Заданы размеры �?, В пр�?моугольного отвер�?ти�? и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отвер�?тие. */

public class BranchingTask31 {

	public static void solution() {

		double a;
		double b;
		double s;
		double s1;
		double s2;
		double s3;

		double x;
		double y;
		double z;

		a = 100;
		b = 200;

		x = 20;
		y = 5;
		z = 10;

		s = a * b;
		s1 = x * y;
		s2 = x * z;
		s3 = y * z;

		if (s > s1 && s > s2 && s > s3) {
			System.out.println("Кирпич проходит через отвер�?тие");

		} else {
			System.out.println("Кирпич не проходит через отвер�?тие");
		}
	}
}
