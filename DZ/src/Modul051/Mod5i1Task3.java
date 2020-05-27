package Modul051;
/*
 * ������� 3кодировка
���������� ������� ����� �����, �� ��������� � 
���������� �����������

����� ������
 */

import java.util.Scanner;

public class Mod5i1Task3 {
	public static void main (String[] Args){
		System.out.println("������� ����������� ��� �������� ������� ����� ����");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();// ������
		scan.close();
		
		String[] words = str.split("\\s"); //������ �� ����
		
		int kolLetter = 0;
		for (int i = 0; i < words.length; i++){
			kolLetter = kolLetter + words[i].length(); //������ ���������� ���� ���� � ������  ьь
			}
		
		System.out.println("�� ����� ������: " + "\""+ str + "\"" + "\n� ������� c��� " + words.length 
				+ "\n������� ���������� ���� � ������ " + kolLetter / words.length);

		/*for (String subStr:words){ // ����� �� ������
			System.out.println(subStr);
		}*/
		
	}

}
