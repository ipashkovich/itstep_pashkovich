package geometry;

import java.util.Scanner;

// КОНСТРУКТОРЫ
public class GetShape {
	public int width;
	public int height;
	public int sideA;
	public int sideB;
	public int sideC;
	
	//для прямоугольника
	public GetShape(int width, int height){
	System.out.println("Введите ширину:");
	Scanner scan = new Scanner(System.in);
	this.width = scan.nextInt();
		    
	System.out.println("Введите высоту:");
	this.height = scan.nextInt();
	scan.close();
}
	//для квадрата
	public GetShape(int width){
	System.out.println("Введите сторону квадрата:");
	Scanner scan = new Scanner(System.in);
	this.width = scan.nextInt();
	scan.close();
}
	//для треугольника
	public GetShape(int sideA, int sideB, int sideC, int height){
	System.out.println("Введите основание треугольника:");
	Scanner scan = new Scanner(System.in);	
	this.sideA = scan.nextInt();	

	System.out.println("Введите стороны треугольника:");
	this.sideB = scan.nextInt();
	this.sideC = scan.nextInt();
	
	System.out.println("Введите высоту треугольника:");
	this.height = scan.nextInt();
	scan.close();
}

}
