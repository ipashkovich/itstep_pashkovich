package Modul02;
/*
 * Написать программу расчета идеального веса к росту. В
константах хранятся рост (height) и вес (weight). Вывести на
консоль сообщение, сколько килограмм нужно набрать или
сбросить (идеальный вес = рост - 110).
 */
public class Mod2Task10 {
	public static void main (String[] Args){
		final double height = 175; // рост
		final double weight = 55.5; // вес
		
		double idealWeight = height - 110; // расчёт идеального веса
		double corWeight =0;
		
		if (weight == idealWeight) {
			System.out.println();			
		        } else if (weight > idealWeight){
			        corWeight = weight - idealWeight;
			        System.out.println("Ваш идеальный вес " + idealWeight + " вам нужно сбросить " + corWeight);
		        } else {
			        corWeight = idealWeight - weight ;
			        System.out.println("Ваш идеальный вес " + idealWeight + " вам нужно набрать " + corWeight);
		}
	}
}