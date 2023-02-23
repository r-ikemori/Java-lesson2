package chapter15;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・
		StringBuilder sum = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sum.append(i+1).append(",");
		}
		String s = sum.toString();
		String[] a = s.split(",");

	}

}
