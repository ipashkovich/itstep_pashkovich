package Modul051;
/*
 * Задание 4
Ввести строку с клавиатуры (латиницей). Из введенной 
строки выбрать все слова, начинающиеся на гласные буквы 
и заканчивающиеся на согласные. Вывести отобранные 
слова на консоль.
 */
import java.util.Scanner;
import java.util.regex.*;

public class Mod5i1Task4 {
	public static void main (String[] Args){
		System.out.println("Введите строку");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		
		Pattern pattern = Pattern.compile ("[A-Za-z]");
		Matcher matcher = pattern.matcher(str);

		
		if (matcher.find()) {
			String[] words = str.split("\\s");
			  for (int i = 0; i < words.length; i++){
				if (words[i].matches("^([aeiouyAEIOUY].+[^aeiouyAEIOUY0-9_#!&])$")) {
					System.out.print(words[i] + " ");
				}else {
					System.out.println("нет совпадений");
				}
			}
		} else {
			 System.out.println("Это не латиница!");
		}
		
	}

}
