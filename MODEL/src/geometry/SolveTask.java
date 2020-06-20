package geometry;

import java.util.Scanner;
public class SolveTask {
	public static void main(String[] Args) {
		int width = 0;
		int height = 0;
		int sideA = 0;
		int sideB = 0;
		int sideC = 0;
    
	    System.out.println("Для какой фигуры будет расчёт?\n 1 - квадрат, 2 - треугольник,3 - прямоугольник");
        Scanner scan = new Scanner(System.in);
        int vibor = scan.nextInt();
    
        switch(vibor){
        case 1:
    	    Square square = new Square();
		    GetShape newSquare = new GetShape(width);
		    System.out.println("Периметр квадрата " + square.getPerimetr(newSquare.width));
		    System.out.println("Площадь квадрата " + square.getArea(newSquare.width));
        break;
        case 2:
    	    Triangle triangle = new Triangle();
		    GetShape newTriangle = new GetShape(sideA, sideB, sideC, height);
		    System.out.println("Периметр треугольника " + triangle.getPerimetr(newTriangle.sideA, newTriangle.sideB, newTriangle.sideC));
		    System.out.println("Площадь треугольника " + triangle.getArea(newTriangle.sideA, newTriangle.height));
        break;
        case 3:
    	    Rectangle rectangle = new Rectangle();
		    GetShape newRectangle = new GetShape(width, height);
		    System.out.println("Периметр прямоугольника " + rectangle.getPerimetr(newRectangle.width, newRectangle.height));
		    System.out.println("Площадь прямоугольника " + rectangle.getArea(newRectangle.width, newRectangle.height));
        break;
        default:
    	   System.out.println("Вы ввели некорректное число для выбора, повторите свой выбор снова"); 
        break;
        }

	}
}
