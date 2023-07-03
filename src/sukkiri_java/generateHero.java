package sukkiri_java;

public class generateHero {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "minato";
		h.HP = 100;
		h.sword = s;
		
		System.out.println("現在の武器は" + h.sword.name);
	}
}