package sukkiri_java;

public class parctice5_4 {
	public static double calcTriangleArea(double bottom , double height){
		double triangle = (bottom*height)/2;
		return triangle;
	}
	public static double calcCircleArea(double radius){
		double Circle = radius*radius*3.14;
		return Circle;
	}
	
	public static void main(String[] args) {
		System.out.println(calcTriangleArea(2,6));
		System.out.println(calcCircleArea(5));
	}
}
