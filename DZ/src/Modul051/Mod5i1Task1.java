package Modul051;
/*
 * ������� 1кодировка 
������ � ���������� ������ ������, � ����� ���� ������. 
�������� �� ������� ������� � ���������� ���������� (���� 
��������� ������� � ������). � ������ ���� ���������� �� 
�������, ������� ��������������� �����. 

 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mod5i1Task1 {
	public static void main (String[] Args){
		System.out.println("������� �����");
		Scanner scan = new Scanner(System.in);
		String userText = scan.nextLine();//����� ������������ ьь
		
		System.out.println("������� ��� ���� ������");
		String userSymb = scan.next();//������ ������������
		scan.close();
		
		if (userSymb.length() > 1) {
			System.out.println("�� ����� ������������ ������");
		} else {

	        Pattern pattern = Pattern.compile(userSymb);
	        Matcher matcher = pattern.matcher(userText);
	        int n = 0;
	        
	        if (matcher.find()){
	        	
	        while (matcher.find()) {
	        	//System.out.println(matcher.group()); // ������� ��������� �������
	            System.out.println(matcher.start()); // ������� �������
	            n++;
	        	}  
	        } else {
	        	   System.out.println("���������� ���");
	           }
	     }
	   }

	}


