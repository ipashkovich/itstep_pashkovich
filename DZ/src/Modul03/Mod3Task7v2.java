package Modul03;
/*
 * Задание 7
Пользователь вводит с клавиатуры букву. Программа 
должна определить, в какой раскладке введена буква – в ла-
тинской или кирилице. Вывести в консоль: «латиница», если 
буква введена латиницей или «кирилица», если буква отно-
сится к кирилическому алфавиту. Если введена цифра, а не 
буква, вывести «цифра». Если символ не относится ни к бук-
вам, ни к цифрам, вывести «невозможно определить».
 */
// ВАРИАНТ 1 - ОСНОВАН НА ЦИФРОВЫХ КОДАХ

import java.util.Scanner;
public class Mod3Task7v2 {
	public static void main(String[] Args){
		System.out.println("Введите любую букву «кирилицей» или «латиницей» ");
		Scanner scan = new Scanner(System.in);
		char letter = scan.next().charAt(0);
		System.out.println("Вы ввели " + letter);
		//System.out.println((int) letter); // 48-0, 65 - A, 97 - a, 90 - Z, 122 - z, 1040 - А, 1072-а, 1103-я
		scan.close();
		
		if (Character.isDigit(letter)) { 
			System.out.println(" это цифра, а не буква");
		} else if (letter >= (char) 65 && letter <= (char) 122) {
			System.out.println("латиница");
			} else if (letter >= (char) 1040 && letter <= (char) 1103) { //но 1105 это ё, 1104 -?
				System.out.println("кирилица");
				} else {
					System.out.println("невозможно определить");
					}
	}
}