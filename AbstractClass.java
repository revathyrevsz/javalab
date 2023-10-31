import java.util.Scanner;
public class AbstractClass {
	public static void main(String [] args) {
		Rectangle rectangle=new Rectangle();
		rectangle.numberOfsides();
		Triangle triangle=new Triangle();
		triangle.numberOfsides();
		Hexagon hexagon=new Hexagon();
		hexagon.numberOfsides();	
	    }
       }
abstract class shape{
	public void numberOfsides() 
	{
	}
}
class Rectangle extends shape{
	public void numberOfsides() {
		System.out.println("The number of sides of Rectangle is "+4);
	}
}
class Hexagon extends shape{
	public void numberOfsides() {
		System.out.println("The number of sides of Hexagon is "+6);
	}
}
class Triangle extends shape{
	public void numberOfsides() {
		System.out.println("The number of sides of Triangle is "+3);
	}
}                                                                                                                                                               

	


