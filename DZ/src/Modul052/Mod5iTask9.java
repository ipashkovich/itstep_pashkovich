package Modul052;
/*
 * Задание 9
Заполнить  массив размерности n случайными цифрами 
от –2 до n. Если в массиве есть хотя бы одно отрицательное 
значение меньше -1, заменить  все отрицательные значение 
в массиве на квадрат (в степени 2) этих значений. Вывести 
исходный и результирующий массив на консоль.

 */
import java.util.*;

public class Mod5iTask9 {
	public static void main(String[] Args){
		System.out.println("Введите количество элементов в массиве");
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int[] arrRamdom = new int[n]; // создали массив 

		final int min = -2; // Минимальное число для диапазона
		final int max = n; // Максимальное число для диапазона
		int diff = max - min;
		Random random = new Random();
		
		for (int i = 0; i < arrRamdom.length; i++) { // заполнили массив рамдом
			int k = random.nextInt(diff + 1);
		    k += min;			
			arrRamdom[i] = k; 
		}
		
		System.out.println("Исходный массив" + Arrays.toString(arrRamdom));//выводим массив
		
		for (int i = 0; i < arrRamdom.length; i++) { 
		    if (arrRamdom[i] < -1){//если число <-1
				for (int j = 0; j < arrRamdom.length; j++) { // то отрицательные числа массива меняем на квадрат этого числа
					if (arrRamdom[i] < 0){
						arrRamdom[i] = arrRamdom[i] * arrRamdom[i];
					} 
				}
		    } 
		 }
		System.out.println("результирующий массив" + Arrays.toString(arrRamdom));//выводим массив 
	}
}
