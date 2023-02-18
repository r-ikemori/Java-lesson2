package doko10;

public class PoisonMatango extends Matango{
	int poison = 5;
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		System.out.println("毒キノコの攻撃");
		if (this.poison > 0) {
			int dmg = h.hp / 5;
			h.hp -= dmg;
			this.poison --;
		}
		
	}

}
