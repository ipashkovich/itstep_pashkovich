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
// ВАРИАНТ 2 - СРАВНЕНИЕ Character.UnicodeBlock.
import java.util.Scanner;
public class Mod3Task7 {
	public static void main(String[] Args){
		System.out.println("Введите любую букву «кирилицей» или «латиницей» ");
		Scanner scan = new Scanner(System.in);
		char letter = scan.next().charAt(0);
		System.out.println("Вы ввели " + letter);
		scan.close();
		
		if (Character.isDigit(letter)) { 
			System.out.println(" это цифра, а не буква");
		} else if (Character.isAlphabetic(letter)) {
				if (Character.UnicodeBlock.of(letter).equals(Character.UnicodeBlock.CYRILLIC)){ 
				System.out.println("кирилица");
				} else if (Character.UnicodeBlock.of(letter).equals(Character.UnicodeBlock.BASIC_LATIN)){
					System.out.println("латиница");
					}
		} else {
		System.out.println("невозможно определить");
		}
	}
}