package Modul02;
/*
 * Задание 2
В переменной n хранится натуральное (целое) трехзнач-
ное число. Создайте программу, вычисляющую и выводя-
щую на экран сумму цифр числа n.
 */
public class Mod2Task2 {
    public static void main (String [] args){
	int n = 354;

	System.out.println( "Сумма чисел " + n + " равна " + (n / 100 + (n % 100 / 10) + n % 10));
	}
}