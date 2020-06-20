package geometry;

public abstract class Shapes {

	public int getPerimetr(int width, int height){
	return (width + height) * 2;
	}
	
	public int getArea(int width, int height){
		return width * height;
	}
	
}

