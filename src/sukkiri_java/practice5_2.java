package sukkiri_java;

public class practice5_2 {
	public static void mail(String title, String address, String text) {
		System.out.println(address + "にメールを送りました");
		System.out.println("件名："+ title);
		System.out.println("本文："+ text);
		
	}
	
	public static void main(String[] args) {
		mail("製品の問い合わせ", "aaaaa@gamil.com", "お電話ください");
	}
}
