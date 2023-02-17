import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int maxHp = 50;
	int mp = 10;
	final int maxmp = 10;
	
	public void selfAid() {
	  System.out.println(this.name + "はセルフエイドを唱えた");
	  this.hp = this.maxHp;
	  this.mp -= 5;
	  System.out.println("HPが満タンになった");
	}
	
	public int pray(int m) {
	  System.out.println(this.name + "は" + m + "秒間天に祈った");
	  int recover = new Random().nextInt(3) + m;
	  int recoverActual = Math.min(this.maxmp - this.mp, recover);
	  this.mp += recoverActual;
	  System.out.println("MPが" + recoverActual + "回復した");
	  return recoverActual;
	}
}
