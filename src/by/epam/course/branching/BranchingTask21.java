package by.epam.course.branching;

import java.util.Scanner;

/*Программа — ль�?тец. �?а �?кране вы�?вечивает�?�? вопро�? «Кто ты: мальчик или девочка? Введи Д или М». В
зави�?имо�?ти от ответа на �?кране должен по�?вить�?�? тек�?т «Мне нрав�?т�?�? девочки!» или «Мне нрав�?т�?�? мальчики!». */

public class BranchingTask21 {

	public static void solution() {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Кто ты: мальчик или девочка? Введи Д или М");

			String string = sc.nextLine();

			switch (string.toUpperCase()) {
			case "М":
				System.out.println("Мне нрав�?т�?�? девочки!");
				break;
			case "Д":
				System.out.println("Мне нрав�?т�?�? мальчики!");
				break;
			default:
				System.out.println("�?е определено !");

			}
		} finally {
			sc.close();
		}
	}
}
