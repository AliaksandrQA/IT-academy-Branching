package by.epam.course.branching;

/*�?апи�?ать программу — модель анализа пожарного датчика в помещении, котора�? выводит �?ообщение
«Пожароопа�?на�? �?итуаци�? », е�?ли температура в комнате превы�?ила 60° С. */ 

public class BranchingTask25 {
	public static void solution() {
		
		int degree;
		
		degree = 45;
		
		if (degree > 60) {
			System.out.println("Температура в комнате превы�?ила 60° С ");
		} else {
			System.out.println("Температура в комнате в пределах нормы");
		}
	}
}
