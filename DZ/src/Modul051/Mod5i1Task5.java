package Modul051;
/*
 * «адание 5
¬вести строку с клавиатуры. ¬ строке должны содержатьс€ 
слова, которые могут быть раздельные пробелами или 
двоеточи€ми. Ќеобходимо вычислить количество слов в 
строке, у которых четное количество букв.
 */

import java.util.Scanner;

public class Mod5i1Task5 {
	public static void main (String[] Args){
		System.out.println("¬ведите предложение");
		
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
		System.out.println(kol + " слов в вашем предложении имеет чЄтное количество букв");	
	}

}
