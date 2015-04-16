package com.capgemini.nodes;

import java.util.ArrayList;
import java.util.List;

/* Error container */
public class Error {
	private static List<String> baza = new ArrayList<String>();
	public static void add(String error_content) {
		baza.add(error_content);
	}
	
	public static void show() {
		if(baza.isEmpty()) {
			System.out.print("Walidacja przebiegla pomyslnie.");
		} else {
			System.out.println("Podczas walidacji wykryto nastepujace bledy:");
			for(String temp : baza) {
				System.out.println(temp);
			}
		}
	}
	
	/* Metoda sprawdza czy w bazie znajduje sie podany error */
	public static Boolean contains(String pattern) {
		for(String tmp : baza) {
			if(tmp.toLowerCase().contains(pattern.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
}
