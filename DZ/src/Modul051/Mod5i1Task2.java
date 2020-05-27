package Modul051;
/*
 * ������� 2кодировка
�������� ���������, ������� ������� ������, � ������� 
��������� ��� ����� �����, ������� � 1, �������� � ���� 
������ �123456789101112131415...�. ������ ������ ���� 
������ �� ����� 1 000 ��������. 
�� ����� n (���������� � ����������), �������� ����� �� 
n-� ������� (������������ ��������� � 1).
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
		
		System.out.println("������� ������� ������ ����� �� 1 �� 1000");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		scan.close();
		
		if (num > 1000){
			System.out.println("�� ����� ������� �����, ��� �����");
		}
		
		System.out.println("���� ����� " + massiv[num]);
	}
}
