package by.epam.course.branching;

/*Со�?тавить программу, определ�?ющую результат гадани�? на ромашке — «любит—не любит», вз�?в за и�?ходное
данное количе�?тво лепе�?тков п. */

public class BranchingTask24 {

	public static void solution() {

		int n;
		int petal;

		n = 6;
		petal = 1;

		for (int i = 1; i <= 6; i++) {
			if (petal % 2 == 0) {
				System.out.println("Любит");
			} else {
				System.out.println("�?е любит");

			}
			petal++;
		}
	}
}
