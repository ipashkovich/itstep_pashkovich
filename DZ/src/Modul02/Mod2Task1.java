package Modul02;
/*
 * Задание 1
В переменных х и y хранятся два натуральных числа. Со-
здайте программу, выводящую на консоль:
результат целочисленного деления x на y;
остаток от деления x на y;
квадратный корень x.
 */
public class Mod2Task1 {
    public static void main (String[] args){
	int x = 144;
	int y = 3;
		
	System.out.println("Результат целочисленного деления x на y = " + x / y);
	System.out.println("Остаток от деления x на y = " + x % y);
	System.out.println("Квадратный корень х = " + Math.sqrt(x));
		
	}
}
