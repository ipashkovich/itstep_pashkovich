package Modul051;
/*
 * Задание 1 
Ввести с клавиатуры строку текста, а затем один символ. 
Показать на консоль индексы и количество совпадений (ищем 
вхождения символа в строку). В случае если совпадений не 
найдено, вывести соответствующий текст.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mod5i1Task1 {
	public static void main (String[] Args){
    System.out.println("Введите текст");
	Scanner scan = new Scanner(System.in);
	String userText = scan.nextLine();
		
	System.out.println("Введите символ");
	String userSymb = scan.next();
	scan.close();
		
	if (userSymb.length() > 1) {
		System.out.println("Вы вели не один символ");
	} else {

	   Pattern pattern = Pattern.compile(userSymb);
	   Matcher matcher = pattern.matcher(userText);
	   int n = 0;
	        
	   		if (matcher.find()){
	        	
	   			while (matcher.find()) {
	   			System.out.println(matcher.start()); 
	   			n++;
	   			}  

	   		} else {
	        	System.out.println("Символ не найден");
	        }
        }
    }
}


