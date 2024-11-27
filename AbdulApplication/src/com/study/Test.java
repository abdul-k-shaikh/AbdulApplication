package com.study;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		String str = "johnjohn";
		Map<Character, Integer> mp = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> e : mp.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
