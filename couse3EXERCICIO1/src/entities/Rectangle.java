package entities;

public class Rectangle {

	public double Width;
	public double Heigth;
	
	public double Area() {
		return Width * Heigth;
	}
	
	public double Perimeter() {
		return 2 * (Width + Heigth);
	}
	public double Diagonal() {
		return Math.sqrt((Width * Width) + (Heigth * Heigth));
	}
	
	
}
