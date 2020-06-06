package Modul052;

/*
 * Задание 4 
 Написать программу, которая проверяет, все ли значения 
 элементов массива различные (не повторяются).  Вывести: 
 Yes – если все различные и No – если имеется хоть одно по-
 вторение. Массив задается и инициализируется в начале 
 программы.
 */

public class Mod5i2Task4 {
	public static void main(String[] Args) {
		int[] arr = { 2, 2, 2, 2, 3 };
		int k = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				k = 1 + k;
			}
		}

		if (k == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
