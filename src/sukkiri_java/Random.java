package sukkiri_java;

public class Random {
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、"+ r + "歳ですね?");
	}

}
