package Modul03;
/*
 * Задание 6
Определить количество дней в году, который вводит
пользователь, и вывести их в консоль. В високосном году –
366 дней, тогда как в обычном – 365. Високосными годами
являются все годы, делящиеся нацело на 4, за исключением
столетий, которые не делятся нацело на 400.
 */

import java.util.Scanner;

public class Mod2Task6 {
	public static void main (String[] Args){
		System.out.println("Введите год");
		
		Scanner scan = new Scanner(System.in);
		int god = scan.nextInt();
		
		if (god % 4 != 0 ) {
			System.out.println("Во введённом Вами году "+ god + " 365 дней, т.к. он НЕ високосный");
		} else if (god % 100 == 0 & god % 400 != 0) {
			System.out.println("Во введённом Вами году "+ god + " 365 дней, т.к. он НЕ високосный и столетие");
		} else if (god % 100 == 0 & god % 400 == 0){
			System.out.println("Во введённом Вами году "+ god + " 366 дней, т.к. он високосный и столетие");
		} else {
			System.out.println("Во введённом Вами году "+ god + " 366 дней, т.к. он високосный");
		}
		
	}

}
