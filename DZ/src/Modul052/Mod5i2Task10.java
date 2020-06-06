package Modul052;
/*
 * Задание 10
Заполнить  массив размерности n случайными циф-
рами от 0 до 33. Найти элемент массива, который делится  
без остатка на значение элемента слева и значение элемен-
та справа. Вывести на консоль значения исходного массива. 
Вывести индекс найденного элемента, если такой не найден, 
вывести -1. n – задается с клавиатуры.
 */

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Mod5i2Task10 {
	public static void main(String[] Args) {
		System.out.println("Введите количество элементов в массиве");
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int[] arrRamdom = new int[n]; // создали массив 

		final int min = 1; // Минимальное число для диапазона
		final int max = 33; // Максимальное число для диапазона
		int diff = max - min;
		Random random = new Random();
		
		Map<Integer, Integer> chislo = new HashMap<Integer, Integer>();//коллекция для результата: ключ индекс массива, значение число из массива

		for (int i = 0; i < arrRamdom.length; i++) { // заполнили массив рамдом
			int k = random.nextInt(diff + 1);
		    k += min;			
			arrRamdom[i] = k; 
		}
		
		System.out.println(Arrays.toString(arrRamdom));//выводим массив
		
		for (int i = 1; i < arrRamdom.length - 1 ; i++) { 
		    if (arrRamdom[i] % arrRamdom[i - 1] == 0 && arrRamdom[i] % arrRamdom[i + 1] == 0 ){//если число делится по условию, помещаем в коллекцию
		    	chislo.put(i, arrRamdom[i]);
		    	//System.out.println("число " + arrRamdom[i] + " индекс " + i);
		    } 
	    }
		if (chislo.isEmpty()){ // если в коллекции нет значений, то выводим -1
			System.out.println("-1");
		} else {
			System.out.println(chislo.keySet()); // иначе выводим индексы массива
		}
	}
}
