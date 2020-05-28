package Modul03;
/*
 * Задание 2
С клавиатуры вводится время (количество часов от 0 до 
24) – программа выводит приветствие, соответствующее 
введенному времени (например, ввели 15 часов – выводится 
приветствие «Добрый день»)
 */
import java.util.Scanner;

public class Mod3Task2 {

	public static void main(String[] Args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Введите время (количество часов от 0 до 24)");
	int time = scan.nextInt();
	scan.close();
		
	if (time > 24 | time < 0){
		System.out.println("Вы ввели некорректное время");
		} else if (time >= 0 & time <= 12) {
			System.out.println("Доброе утро!");
		} else if (time > 12 & time <= 18) {
			System.out.println("Добрый день!");
		} else {
			System.out.println("Добрый вечер!");
		}
	}
}