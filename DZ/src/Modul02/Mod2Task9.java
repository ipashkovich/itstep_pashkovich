package Modul02;
/*
 * Проверить, имеет ли число вещественную часть. Напри-
мер, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0
и 10.0 – нет.
 */
import java.util.Scanner;

public class Mod2Task9 {
	public static void main (String[] Args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Введите число");
		
		float x = scan.nextFloat();
		
		if (x == 0) {
			System.out.println("ваше число 0");
		} else if (x % 1 == 0) {
			System.out.println(x + " не имеет вещественной части");
				} else {
						System.out.println(x + " имеет вещественную часть");
						}
				}
}