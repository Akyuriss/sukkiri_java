package sukkiri_java;
import java.util.Random;

public class Cleric {
	int HP =50;
	final int maxHP = 50;
	int MP = 10;
	final int maxMP = 10;
	
	
	public void selfAid() {
		this.MP -= 5;
		this.HP += maxHP;
		System.out.println("HP:"+this.HP+"MP："+this.MP+"になった");
	}
	
	public void pray(int second) {
		Random random = new Random();
		int healMP = random.nextInt(3) + second;
		MP += healMP;
		if(MP > maxMP) {
			MP = maxMP;
		}
		
	}
}
