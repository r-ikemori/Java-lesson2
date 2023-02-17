package doko1;

public class Main {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
		thief.hp += 10;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int baseHp = 25 ;
		Thief t = new Thief("アサカ",baseHp);
		heal(baseHp);
		System.out.println(baseHp + ":" + t.hp);
		heal(t);
		System.out.println(baseHp + ":" + t.hp);
	}

}
