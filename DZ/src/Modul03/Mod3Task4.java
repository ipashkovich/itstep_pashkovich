package Modul03;
/*
 * Задание 4
Дана точка на плоскости заданная координатами x  и y, 
определить и вывести в консоль,  в какой четверти находит-
ся точка, в прямоугольной (декартовой)  системе координат. 
Четверти обозначены римскими цифрами.
 */
import java.util.Scanner;

public class Mod3Task4 {

	public static void main (String[] Args){
	Scanner scan = new Scanner (System.in);
	System.out.println("Введите x и y");
	int x = scan.nextInt();
	int y = scan.nextInt();
		
	if (x < 0 & y > 0){
		System.out.println("Это 2 плоскость");
	} else if (x < 0 & y < 0){
		System.out.println("Это 3 плоскость");
	} else if (x > 0 & y < 0){
		System.out.println("Это 4 плоскость");
	} else {
		System.out.println("Это 1 плоскость");
	}
		
	}
}