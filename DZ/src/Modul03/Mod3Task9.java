package Modul03;
/*
 * Задание 9
Даны координаты начала и координаты конца отрезка. 
Если считать отрезок обозначением горки, то в одном слу-
чае он обозначает спуск, в другом – подъем. Определить и 
вывести на экран – спуск это или подъем, ровная дорога или 
вообще отвесная.
 */
import java.util.Scanner;

public class Mod3Task9 {
	public static void main (String[] Args){
		System.out.println("Дайте координаты\nВведите начальные х и у");
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
			
		System.out.println("Введите конечную координату");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		scan.close();

		if ((x1 < x2 & y1 < y2) | (x1 > x2 & y1 > y2 )){
			System.out.println ("Вы ввели начало (" + x1 + ";" + y1 + ") и конец (" + x2 + ";" + y2 + ")\nЭто подъём");	
			} else if ((x1 < x2 & y1 > y2) | (x1 > x2 & y1 < y2 )) {
				System.out.println ("Вы ввели начало (" + x1 + ";" + y1 + ") и конец (" + x2 + ";" + y2 + ")\nЭто спуск");	
			} else if (x1 == x2 & y1 != y2) {
				System.out.println ("Вы ввели начало (" + x1 + ";" + y1 + ") и конец (" + x2 + ";" + y2 + ")\nЭто отвесная дорога");
			} else if (y1 == y2 & x1 != x2){
				System.out.println ("Вы ввели начало (" + x1 + ";" + y1 + ") и конец (" + x2 + ";" + y2 + ")\nЭто ровная дорога");
			} else {
				System.out.println ("Вы ввели начало (" + x1 + ";" + y1 + ") и конец (" + x2 + ";" + y2 + ")\nВы стоите");
			}
		
			}
}
