
public class StrongHero extends Hero{
	boolean flying;
	public void fly() {
		if(this.flying == true) {
			System.out.println("すでに飛んでいる！！");
		}else {
		this.flying = true;
		System.out.println("飛び上がった！");
		}
	}
	
	public void land() {
		if (this.flying == false) {
			System.out.println("すでに着地している");
		}else {
			this.flying = false;
			System.out.println("着地した");
		}
	}

}
