package by.epam.course.branching;

/* �?а пло�?ко�?ти ХОY задана �?воими координатами точка �?. Указать, где она ра�?положена (на какой о�?и или в каком
координатном угле). */

public class BranchingTask16 {
	
	public static void solution () {
		
		double x;
        double y;

        
        x = 5.0;
        y = - 9.0;
        if (x > 0 && y > 0) {
            System.out.println("Точка (" + x + ", " + y + ") находит�?�? в 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка (" + x + ", " + y + ") находит�?�? во 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка (" + x + ", " + y + ") находит�?�? в 3 четверти");
        } else if (x > 0 && y < 0){
            System.out.println("Точка (" + x + ", " + y + ") находит�?�? в 4 четверти");
        } else if (x == 0 && y != 0){
            System.out.println("Точка (" + x + ", " + y + ") находит�?�? на о�?и y");
        } else if (x != 0 && y == 0){
            System.out.println("Точка (" + x + ", " + y + ") находит�?�? на о�?и x");
        } else if (x == 0 && y == 0){
            System.out.println("Точка (" + x + ", " + y + ") находит�?�? в начале координат");
        }
		
		
		
	}

}
