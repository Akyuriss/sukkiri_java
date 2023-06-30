package sukkiri_java;

public class code4_17 {
	public static void main(String[] args) {
		int[] array1 = {1,2,3};
		int[] array2;
		array2 = array1;
		array1 = null;
//		array2[0] = 10;
		System.out.println(array2[0]);
	}
}
