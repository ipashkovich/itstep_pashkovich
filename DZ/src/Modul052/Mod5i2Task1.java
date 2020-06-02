package Modul052;
/*
 * Задание 1 
Заполнить массив на 15 элементов числами Фибоначчи. 
Вывести на консоль  только четные элементы массива.

 */

public class Mod5i2Task1 {
    public static void main(String[] Args) {
	int[] arrFibonachi = new int[15]; //создали массив на 15 элементов
	arrFibonachi[0] = 1;
	arrFibonachi[1] = 1;
	for (int i = 2; i < 15; i++){ //заполнили массив
	    arrFibonachi[i] = arrFibonachi[i - 2] + arrFibonachi[i - 1]; //числа фиббоначи
	}
		
	for (int i = 0; i < 15; i++){ //выводим четные элементы
	    if (arrFibonachi[i] % 2 == 0){
		System.out.println(arrFibonachi[i]);
	    }
			
	}

    }

}
