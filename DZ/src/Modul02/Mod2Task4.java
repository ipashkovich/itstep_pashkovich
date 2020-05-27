package Modul02;
/*
 * Задание 4
Написать программу, которая выведет на консоль «Hello
world», не используя в исходном коде пробельных символов.
 */
public class Mod2Task4 {
    public static void main (String [] Args){
	char s= '\u0020';
	System.out.println("Hello" + s + "world");
		
	//вариант2
	String hello = "Hello\u0020world";
	System.out.println(hello);
	}
}