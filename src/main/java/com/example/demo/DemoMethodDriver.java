package com.example.demo;

import static com.example.demo.StaticMethodCallDemo.*;
import static java.lang.System.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoMethodDriver {

	public static void main(String[] args) {

		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("Hello", "2");
		map.put("World", "1");
		
		// create an arraylist initialized with keys of map
		ArrayList keyList = new ArrayList(map.keySet());
		for (int i = keyList.size() - 1; i >= 0; i--) {
			// get key
			String key = (String) keyList.get(i);
			System.out.println("Key :: " + key);
			// get value corresponding to key
			String value = map.get(key);
			System.out.println("Value :: " + value);
			System.out.println("--------------------------------");
		}
	}

}
