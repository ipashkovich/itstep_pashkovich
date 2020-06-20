package geometry;

public class Square extends Shapes implements ICalculateable {
	
	
	public int getPerimetr(int width){
		return width * 4;
	}
	
	public int getArea(int width){
		return width * width;
	}
	
}
