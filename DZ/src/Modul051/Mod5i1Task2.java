package Modul051;
/*
 * Задание 2
Написать программу, которая создаст строку, в которой 
находятся все целые числа, начиная с 1, выписаны в одну 
строку «123456789101112131415...». Строка должна быть 
длиной не более 1 000 символов. 
По числу n (введенного с клавиатуры), выведите цифру на 
n-й позиции (используется нумерация с 1).
 */
import java.util.Scanner;

public class Mod5i1Task2 {
	public static void main (String[] Args){
		int[] massiv = new int [1001];
		
		for (int i = 1; i < massiv.length; i++){
			massiv[i] = i;
		}
		/*for (int i = 1; i < massiv.length; i++){
		*System.out.print(massiv[i]);
		}*/
		
		System.out.println("Введите позицию нужной цифры от 1 до 1000");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		scan.close();
		
		if (num > 1000){
			System.out.println("Вы ввели большее число, чем можно");
		}
		
		System.out.println("Ваше число " + massiv[num]);
	}
}
