package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Prac16_2 {

	public static void main(String[] args) {

		Hero_16 Hero1 = new Hero_16("斎藤");
		Hero_16 Hero2 = new Hero_16("鈴木");

		ArrayList<Hero_16> Heros = new ArrayList<Hero_16>();

		Heros.add(Hero1);
		Heros.add(Hero2);

		for(Hero_16 h : Heros  ) {
			System.out.println(h.getName());
		}

		Map<Hero_16,Integer> battles = new HashMap<Hero_16, Integer>();
		battles.put(Hero1, 3);
		battles.put(Hero2, 7);
		for(Hero_16 key : battles.keySet()) {
			int value = battles.get(key);
			System.out.println(key.getName() + "が倒した数="+ value);
		}

	}

}
