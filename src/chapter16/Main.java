package chapter16;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		
		List<Hero> heros = new ArrayList<>();
		heros.add(h1);
		heros.add(h2);
		
		for (Hero s:heros) {
			System.out.println(s.getName());
		}
		
		Map<Hero,Integer> kills = new HashMap<>();
		kills.put(h1,3);
		kills.put(h2,7);
		
		for (Hero key:kills.keySet()) {
			int value = kills.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}




	}

}
