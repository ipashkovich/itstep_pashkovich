package Modul02;
/*Есть прямоугольник, у которого известна ширина w и
высота h. Найти и вывести на консоль периметр и площадь
заданного прямоугольника. Высота и ширина прямоуголь-
ника должна задаваться константными переменными в коде
программы.
  */
public class Mod2Task6 {
    public static void main (String[] Args){
		final int w = 5;
		final int h = 3;
		
		int perim = 2 * (w + h); // расчёт периметра
		int sq = (w * h); // площадь прямоугольника
		System.out.println("Если ширина " + w + ", а высота " + h + " ,то: \nПериметр равен " + perim + "\nПлощадь равна " + sq);
	}
}