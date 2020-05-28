package Modul03;
/*
 * Задание 1 
Написать программу, которая предлагает пользователю 
ввести c клавиатуры номер дня недели, и в ответ показыва-
ет название этого дня (например, 6 – это суббота). Решить с 
использованием switch.
 */
import java.util.Scanner;
public class Mod3Task1 {
    public static void main (String[] Args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Введите число от 1 до 7 ");
	int day = scan.nextInt();
	scan.close(); 
	switch (day) {
	    case 1: 
	    	System.out.println("Понедельник");
	    	break;
		case 2: 
			System.out.println("Вторник");
			break;
		case 3: 
			System.out.println("Среда");
			break;
		case 4: 
			System.out.println("Четверг");
			break;
		case 5: 
			System.out.println("Пятница");
			break;
		case 6: 
			System.out.println("Суббота");
			break;
		case 7: 
			System.out.println("Воскресенье");
			break;
		default:
			System.out.println("Вы ввели число больше 7");
			}
		return;
			    
		}
}