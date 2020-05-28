package Modul03;
/*
 * Задание 12
Программа запрашивает шестизначное число. После вво-
да определяет, будет ли являться «счастливым» билет с та-
ким номером (сумма первых трех цифр совпадает с суммой 
трех последних).
Пример входных данных: 
423027
954832
Вывод:
Да
Нет
 */

import java.util.Scanner;
public class Mod3Task12 {
	public static void main (String[] Args){
		System.out.println("Введите шестизначное число");
		Scanner scan = new Scanner(System.in);
		
		String bilet = scan.next();
		scan.close();
		
		if (bilet.length() > 6){
			System.out.println("Вы ввели не шестизначное число, попробуйте опять");
			} else {
				int bil1 = Integer.parseInt(bilet.substring(0, 1)) 
						+ Integer.parseInt(bilet.substring(1, 2)) + Integer.parseInt(bilet.substring(2, 3));
				int bil2 = Integer.parseInt(bilet.substring(3, 4)) 
						+ Integer.parseInt(bilet.substring(4, 5)) + Integer.parseInt(bilet.substring(5, 6));
				
				if (bil1 == bil2){
						System.out.println("Ваш билет " + bilet + " счастливый");	
					} else {
						System.out.println("Ваш билет " + bilet + " Не счастливый");
					 	}
					}
	}
}