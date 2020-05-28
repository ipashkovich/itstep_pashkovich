package Modul03;
/*
 * Задание 8
Даны два числа x и y. Программа должна вывести в кон-
соль YES, – если оба числа четные, либо оба числа нечетные; 
иначе программа ничего не выводит.
 */
import java.util.Scanner;

public class Mod3Task8 {
	public static void main (String[] Args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите целое число x");
		int x = scan.nextInt();
		System.out.println("Введите целое число y");
		int y = scan.nextInt();
		
		scan.close();
			if ((x % 2 == 0 & y % 2 == 0)|(x % 2 != 0 & y % 2 != 0)){
				System.out.println("YES");
			} 
	}

}
