package by.epam.course.branching;

/*Перера�?пределить значени�? переменных х и у так, чтобы в х оказало�?ь большее из �?тих значений, а в y - меньшее.*/

public class BranchingTask22 {

	public static void solution() {

		double x;
		double y;

		x = 9;
		y = 11;

		if (x == y) {
			System.out.println("переменные х и у равны");
		}
		if (x > y) {
			System.out.println("переменна�? х больше переменной y");
		}
		if (x < y) {
			double temp = x;
			x = y;
		}
		System.out.println("Значение x ="+" "+x);
		System.out.println("Значение y ="+" "+y);

	}

}
