package Modul03;
/*
 * Задание 10
Определить номер подъезда девятиэтажного дома, по 
указанному номеру квартиры N. Считать, что на каждом 
этаже находится M квартир. Вывести в консоль номер подъ-
езда. 

 */
import java.util.Scanner;
public class Mod3Task10 {
	public static void main (String[] Args){
		System.out.println("Введите номер квартиры");
		Scanner scan = new Scanner (System.in);
		int numFlat = scan.nextInt();
		
		System.out.println("Сколько квартир на одном этаже?");
		int kolFlat = scan.nextInt();
		scan.close();
		
		int pod = (numFlat / kolFlat + 1) / 9 + 1;
		
		System.out.println("Квартира номер " +numFlat + " находится в подъезде " + pod);
	}
}