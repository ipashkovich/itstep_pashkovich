package Modul03;
/*
 * Задание 3
Написать программу, которая предлагает пользователю
выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
ответ показывает, какие звуки издает выбранное животное.
В списке должно быть не менее 10 животных.
 */
import java.util.Scanner;

public class Mod3Task3 {

	public static void main (String[] Args){
		
	String [][] twoDimArray = {{"1 - котик","2 - собачка","3 - корова","4 - лошадь","5 - коза","6 - овца","7 - курица"},
	    						{"мяу-мяу","гав-гав","му-му","иго-го","меееее","беееее","ко-ко"}};//объявили массив и заполнили его элементами
		
	int kCol=twoDimArray[0].length; // кол-во столбцов в массиве
	int kRow=twoDimArray.length; // кол-во строк в массиве
				
	System.out.println("Из списка выберите животное, и оно заговорит:");
	for (int j = 0; j < kCol; j++) {//идём по столбцам
		System.out.println(twoDimArray[0][j]); //вывод элемента
	         }
	Scanner scan = new Scanner(System.in);
	int vibor = scan.nextInt();
		
	// вывод результата: животное и как говорит
	System.out.println("Выбранное вами животное " + twoDimArray[0][vibor-1] + "\nон говорит " + twoDimArray[1][vibor-1]);
	}
}