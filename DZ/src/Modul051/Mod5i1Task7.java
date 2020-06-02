package Modul051;

/*
 * Задание 7
 Пользователь вводит с клавиатуры любую строку. 
 Поменять в исходной строке все большие буквы на 
 маленькие, а маленькие – на большие. Если в строке при-
 сутствуют цифры, заменить на символ подчеркивания и 
 вывести результат на консоль.
 */

import java.util.Scanner;

public class Mod5i1Task7 {
	public static void main(String[] Args) {
		System.out.println("Введите предложение");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		str = str.replaceAll("[0-9]", "_"); // цифры меняем на _

		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (Character.isLetter(array[i])) {// (Character.isDigit(array[i]))
												// для поиска цифр
				if (Character.isLowerCase(array[i])) {
					array[i] = Character.toUpperCase(array[i]);
				} else {
					array[i] = Character.toLowerCase(array[i]);
				}
			}
		}
		System.out.println(new String(array));
	}
}
