package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
    // プログラムを作成
	private int m;
	public FlyingPhone(int m) {
		this.m = m;
	}
	
	public void fly () {
		System.out.println( m + "秒間飛びます");
	}

	public void call(String number) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println( number + " に電話をします。通話しできるのは飛んでいるときです");
	}
	
	public void powerOff () {
    	System.out.println("飛んでいる場合は落下します");
    }
}