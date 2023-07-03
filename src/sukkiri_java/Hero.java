package sukkiri_java;

public class Hero {
	String name;
	int HP;
	Sword sword;
	
	public Hero(String name) {
		this.HP = 100;
		this.name = name;
	}
	
	public Hero() {
		this("ダミー");
	}
	public void attack() {
		System.out.println(this.name + "の攻撃");
		System.out.println("5ポイントのダメージを与えた。");
	}
	
	public void run(){
		System.out.println(this.name + "は逃げ出した");
	}
}
