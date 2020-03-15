package by.epam.course.branching;

import java.util.Scanner;

/*Вычи�?лить чи�?ло и ме�?�?ц в неви�?око�?ном году по номеру дн�?.*/

public class BranchingTask35 {

	public static void solution() {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Введите желаемое чи�?ло ме�?�?ца");
			int number = scan.nextInt();
			System.out.println("Введите желаемое номер ме�?�?ца");
			int month = scan.nextInt();

			switch (month) {
			case 2:
				
				System.out.println(number+" "+" "+"чи�?ло"+" " + "28 дней в ме�?�?це");
				break;
			case 1: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"31 день в ме�?�?це");
				break;
			}
			case 3: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"31 день в ме�?�?це");
				break;
			}
			case 4: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"30-й день в ме�?�?це");
				break;
			}
			case 5: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"31 день в ме�?�?це");
				break;
			}
			case 6: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"30-й день в ме�?�?це");
				break;
			}
			case 7: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"31 день в ме�?�?це");
				break;
			}
			case 8: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"30-й день в ме�?�?це");
				break;
			}
			case 9: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"31 день в ме�?�?це");
				break;
			}
			case 10: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"30-й день в ме�?�?це");
				break;
			}
			case 11: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"31 день в ме�?�?це");
				break;
			}
			case 12: {
				System.out.println(number+" "+" "+"чи�?ло"+" " +"30-й день в ме�?�?це");
				break;
			}
			default:
				System.out.println("�?е определено !");

			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid Input. Relaunch the app");
		} finally {
			scan.close();
		}
	}
}