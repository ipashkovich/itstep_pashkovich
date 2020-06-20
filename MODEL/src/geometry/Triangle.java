package geometry;

public class Triangle extends Shapes implements ICalculateable {

	public int getPerimetr( int a, int b, int c){
		return  a + b + c;
	}
		
	public int getArea(int a, int height ){
		return (a * height) / 2;
	}
}
