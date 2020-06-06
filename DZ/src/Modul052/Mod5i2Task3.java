package Modul052;

import java.util.Arrays;

/*
 * Задание 3
 Написать программу, которая проверяет, все ли значения 
 элементов массива одинаковые.  Вывести: Yes – если все оди-
 наковы и No – если имеется хоть одно различие. Массив за-
 дается и инициализируется в начале программы.

 */
public class Mod5i2Task3 {
	public static void main(String[] Args) {
		int[] arr = { 2, 2, 2, 2, 2 };
		int k = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				k = 0;
			} else {
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
