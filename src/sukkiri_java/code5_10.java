package sukkiri_java;

public class code5_10 {
	public static int add(int x ,int y) {
		return x+y;
	}
	
	public static double add(double x , double y) {
		return x+y;
	}
	public static String add(String x , String y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10,5));
		System.out.println(add(5.3 , 7.9));
		System.out.println(add("a","u"));
	}
}
