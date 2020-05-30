package Modul051;
/*
 * Задание 3
Подсчитать среднюю длину слова, во введенном с 
клавиатуры предложении.
 */

import java.util.Scanner;

public class Mod5i1Task3 {
	public static void main (String[] Args){
		System.out.println("Введите предложение");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		
		String[] words = str.split("\\s");
		
		int kolLetter = 0;
		for (int i = 0; i < words.length; i++){
			kolLetter = kolLetter + words[i].length(); 
			}
		
		System.out.println("Вы ввели предложение: " + "\""+ str + "\"" + "\nВсего слов " + words.length 
				+ "\nСредняя длина слова " + kolLetter / words.length);
	}

}
