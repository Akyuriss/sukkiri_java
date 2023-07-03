package sukkiri_java;

public class generateHeroAndWizard {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "minato";
		h1.HP = 100;
		
		Hero h2 = new Hero();
		h2.name = "asaka";
		h2.HP = 200;
		
		Wizard w = new Wizard();
		w.name = "sugawara";
		w.HP = 50;
		
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		
	}
}
