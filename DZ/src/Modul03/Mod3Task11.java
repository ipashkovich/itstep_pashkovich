package Modul03;
/*
 * Задание 11
Найти корни квадратного уравнения и вывести их на 
экран, если они есть. Если корней нет, то вывести сообще-
ние об этом. Конкретное квадратное уравнение определяет-
ся коэффициентами a, b, c, которые вводит пользователь с 
клавиатуры.
 */

import java.util.Scanner;

public class Mod3Task11 {
	public static void main (String[] Args){
		System.out.println("Введите a, b, с для решения квадратного уравнения вида ax^2+bx+c=0" );
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();

		double d = b * b - 4 * a * c;
			if (d > 0){
			double	x1 = (-b - Math.sqrt(d)) / 2 * a;
			double	x2 = (-b + Math.sqrt(d)) / 2 * a;
			    System.out.printf("У вас получилось уравнение: " + "%.0f" + "x^2+" + "%.0f" + "x+" + "%.0f" + "=0\n"
			       + "Корни уравнения: х1 = " + x1 + " и х2 = " + x2 , a, b, c );
				  } else if (d == 0) {
					double x = -b / (2 * a);
				    	System.out.printf("У вас получилось уравнение: " + "%.0f" + "x^2+" + "%.0f" + "x+" + "%.0f" + "=0\n"
						       + "Корень уравнения единственный: х = " + x , a, b, c );
				  } else {
					     System.out.printf("У вас получилось уравнение: " + "%.0f" + "x^2+" + "%.0f" + "x+" + "%.0f" + "=0\n"
						       + "Корней у этого уравнения нет!", a, b, c );
				  		}
	}
}