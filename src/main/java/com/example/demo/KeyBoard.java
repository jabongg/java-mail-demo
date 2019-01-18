package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class KeyBoard {
	public static void main(String[] args) throws Exception {
		ArrayList<String> strings = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 10; i++) {
			strings.add(String.valueOf(i));
		}
		
		for (int i = 0; i < 10; i++) {
			strings.add(9 - i, br.readLine());
		}
		
		for (int i = 0; i < 10; i++)
			System.out.println(strings.get(i));
	}
}