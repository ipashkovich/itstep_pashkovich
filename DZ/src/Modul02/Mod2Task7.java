package Modul02;
/*Разработать программу, которая позволит при известном
годовом проценте вычислить сумму вклада в банке через
два года, если задана исходная величина вклада.
Расчёт вознаграждения на год (Вклад*процент) 

*/
public class Mod2Task7 {
	public static void main (String [] Args){
		double proc = 0.048; //годовой процент 365 дней - 4,8%
		
		double nowMoney = 11111.25; // исходная денежка
		double bankMoney = 0; //вознаграждение
		double nextMoney = nowMoney; // через 2 года денежка
		
		int god = 0; // переменная для количества лет
		
	    while (god <= 2) {
			
			bankMoney = nextMoney * proc; //вознаграждение за год
		    nextMoney = nextMoney + bankMoney;// через год
		    god = god +1;
		    god++;
	    }
		    System.out.println("У вас было " + nowMoney + "\nЧерез два года стало " + nextMoney);
	}

}