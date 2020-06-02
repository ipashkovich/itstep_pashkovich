package Modul051;

/*
 * Задание 10
 Напишите программу, которая будет печатать 
 ромбовидный рисунок на основе строки, введенной с 
 клавиатуры (максимальная длина – 50 символов). 
 Пример вывода для строки testing:
 */
public class Mod5i1Task10 {
    public static void main(String[] Args) {
	String str = new String("testing");
	// ВАРИАНТ 1
		/*
		 * for (int i = 1; i <= str.length(); i++){ 
		 * System.out.printf("%50." + i + "s%n", str); }
		 * 
		 * for (int i = 1; i <= str.length(); i++){ 
		 * int otstup = 50 - i;
		 * System.out.printf("%" + otstup + "s%n", str.substring(i)); }
		 */

	// ВАРИАНТ 2
	int k = 1;
	do {
	    switch (k) {
		case (1):
		    for (int i = 1; i <= str.length(); i++) {
			System.out.printf("%50." + i + "s%n", str);
		    }
		case (2):
		     for (int i = 1; i <= str.length(); i++) {
			int otstup = 50 - i;
			System.out.printf("%" + otstup + "s%n", str.substring(i));
		      }
	    } k++;
	} while (k < 2);
    }
}
