package by.epam.course.branching;

import java.util.Scanner;

/*Определить правильно�?ть даты, введенной �? клавиатуры (чи�?ло — от 1 до 31, ме�?�?ц — от 1 до 12). Е�?ли введены
некорректные данные, то �?ообщить об �?том. */

public class BranchingTask23 {

	public static void solution() {

		System.out.print("Введите любое целое чи�?ло от 1 до 31: ");
		Scanner scan = new Scanner(System.in);
		try {

			int number = scan.nextInt();

			if (number < 1 || number > 31) {
				System.out.println("Дата не �?оответ�?твует требовани�?м");
			} else {
				System.out.println("Вы ввели чи�?ло " + number);
			}

			System.out.print("Введите любое целое чи�?ло от 1 до 12: ");
			int number2 = scan.nextInt();

			if (number2 < 1 || number2 > 12) {
				System.out.println("Дата не �?оответ�?твует требовани�?м");
			} else {
				System.out.println("Вы ввели ме�?�?ц равный " + number2);
			}
		}

		catch (java.util.InputMismatchException e) {
			System.out.println("Invalid Input. Relaunch the app");
		}
scan.close();
	}
}