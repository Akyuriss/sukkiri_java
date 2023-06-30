package sukkiri_java;

public class code4_12 {
	public static void main(String args[]) {
		int[] seq = new int[10];
		char[] base = {'A','T','G','C'};
		for(int i=0 ; i<seq.length;i++) {
			int random = new java.util.Random().nextInt(4);
			System.out.print(base[random] + " ");
		}
	}
}
