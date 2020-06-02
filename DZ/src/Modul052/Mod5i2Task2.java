package Modul052;
/*
 * Задание 2
Заполнить массив на 30 элементов случайными числами  
от -70 до +50. Найти минимальный элемент и вывести его 
на консоль. Найти максимальный элемент и вывести его на 
консоль. 
 */
import java.util.Arrays;

public class Mod5i2Task2 {
	public static void main(String[] Args) {
		int[] arrRamdom = new int[30]; //создали массив на 30 элементов
			
		final int min = -70; // Минимальное число для диапазона
		final int max = +50; // Максимальное число для диапазона
			
		for (int i = 0; i < 30; i++){ //заполнили массив
			arrRamdom[i] = (int) (Math.random() * min) + max;
		}
			
		Arrays.sort(arrRamdom);
		System.out.println("Минимальный элемент" + arrRamdom[0]);
		System.out.println("Максимальный элемент" + arrRamdom[29]);
	}
}
