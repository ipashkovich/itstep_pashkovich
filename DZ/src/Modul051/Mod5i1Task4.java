package Modul051;
/*
 * ������� 4кодировка
������ ������ � ���������� (���������). �� ��������� 
������ ������� ��� �����, ������������ �� ������� ����� 
� ��������������� �� ���������. ������� ���������� 
����� �� �������. 
 */
import java.util.Scanner;
import java.util.regex.*;

public class Mod5i1Task4 {
	public static void main (String[] Args){
		System.out.println("������� ����������� ���������");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();// ������
		scan.close();
		
		Pattern pattern = Pattern.compile ("[A-Za-z]");// ��� �������� ��������� ьь
		Matcher matcher = pattern.matcher(str);

		
		if (matcher.find()) {
			String[] words = str.split("\\s");
			  for (int i = 0; i < words.length; i++){
				if (words[i].matches("^([aeiouyAEIOUY].+[^aeiouyAEIOUY0-9_#!&])$")) {// �������� ������ ����� �������, ��������� ���������
					System.out.print(words[i] + " ");
				}else {
					System.out.println("���������� �� �������");
				}
			}
		} else {
			 System.out.println("�� ����� �� ���������!");
		}
		
	}

}
