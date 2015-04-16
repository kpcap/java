package com.capgemini.pascalrectangle;

/**
 * Created by ldrygala on 2015-01-23.
 * 0                     1
 * 1                   1   1
 * 2                 1   2   1
 * 3               1   3   3   1
 * 4             1   4   6   4   1
 * 5           1   5   10  10   5   1
 * 6         1   6   15  20  15   6   1
 * 7       1   7   21  35  35   21  7   1
 * 8     1   8   28  56  70  56   28  8   1
 * 9   1   9  36   84  126 126  84  36  9   1
 */

public class PascalRectangle {
	
	/* Funkcja odpowiedzialna za odstepy pomiedzy poszczegolnymi liczbami */
	public static String offset(long liczba, int spacja) {
		String zapisz = liczba + ""; 
		while (zapisz.length() < spacja) { 
			zapisz = zapisz + " ";
		}
		return zapisz;
	}
	
	/* Funkcja oblicza wartosc na aktualnej pozycji */
	public long pascal(int r, int c) {
		//pierwsza i ostatnia kolumna zawsze rowna 1
		if (c == 1 || c == r) {
			return 1;
		} else { 
			// w przeciwnym wypadku obliczamy wartość na podstawie liczb z wiersza wyżej
			return pascal(r - 1, c - 1) + pascal(r - 1, c);
		}
	}
	
	/* Drukuje trojkat pascala o wysokosci 10 wierszy */
	public void print() {
		int h = 10; //wysokosc trojkata
		int odstep = 6; //odstep pomiedzy liczbami w wierszu
		for (int i = 1; i <= h; i++) { 
			//Drukujemy spacje 
			for (int j = 1; j <= h - i; j++) { 
				System.out.print("   ");
			}
			//Drukujemy liczby
			for (int k = 1; k <= i; k++) {
				System.out.print(offset(pascal(i, k), odstep));
			}
			System.out.println();
		}
	}
	
}