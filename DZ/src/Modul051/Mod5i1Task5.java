package Modul051;
/*
 Задание 5
Ввести строку с клавиатуры. В строке должны содержаться 
слова, которые могут быть раздельные пробелами или 
двоеточиями. Необходимо вычислить количество слов в 
строке, у которых четное количество букв.
 */

import java.util.Scanner;

public class Mod5i1Task5 {
	public static void main (String[] Args){
		System.out.println("Введите строку");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String[] words = str.split("\\s");
		
		int kol = 0;
		for (int i = 0; i < words.length; i++){
			if (words[i].length() % 2 == 0){
				kol = kol + 1;
			}
		}
		System.out.println(kol + " количество слов в строке, у которых четное количество букв");	
	}

}
