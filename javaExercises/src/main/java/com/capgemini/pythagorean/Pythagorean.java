package com.capgemini.pythagorean;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Pythagorean {
	public static int findProduct(int sum) {
		for(int a = 0; a <= sum; a++){
			for(int b = 0; b <= sum; b++){
				for(int c = 0; c <= sum; c++) {
					if(a<b && b<c && a+b+c == sum && (c*c == a*a + b*b)) {
						int product = a*b*c;
						return product;
					}
				}
			}
		}
		return sum;
	}
}