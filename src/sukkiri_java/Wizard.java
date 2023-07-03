package sukkiri_java;

public class Wizard {
	String name ;
	int HP;
	public void heal(Hero h) {
		h.HP += 10;
		System.out.println(h.name + "のHPを10回復した");
		System.out.println(h.name + "の体力は" + h.HP + "になった");
	}
}
