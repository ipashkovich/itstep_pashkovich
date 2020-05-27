package Modul051;
/*
 * Задание 3
Подсчитать среднюю длину слова, во введенном с 
клавиатуры предложении

ЧЕРЕЗ МАССИВ
 */

import java.util.Scanner;

public class Mod5i1Task3 {
	public static void main (String[] Args){
		System.out.println("Введите предложение для рассчёта средней длины слов");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();// строка
		scan.close();
		
		String[] words = str.split("\\s"); //массив из слов
		
		int kolLetter = 0;
		for (int i = 0; i < words.length; i++){
			kolLetter = kolLetter + words[i].length(); //расчёт количества всех букв в словах
			}
		
		System.out.println("Вы ввели строку: " + "\""+ str + "\"" + "\nв которой cлов " + words.length 
				+ "\nСреднее количество букв в словах " + kolLetter / words.length);

		/*for (String subStr:words){ // вывод по словам
			System.out.println(subStr);
		}*/
		
	}

}
