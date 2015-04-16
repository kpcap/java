package com.capgemini.coins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ldrygala on 2015-02-06.
 * <p/>
 * Consider N coins aligned in a row. Each coin is showing either heads or tails. The adjacency of these coins is the number of adjacent pairs of coins
 * with the same side facing up.
 * <p/>
 * It must return the maximum possible adjacency that can be obtained by reversing exactly one coin (that is, one of the coins must be reversed). 
 * Consecutive elements of array A represent consecutive coins in the row. Array A contains only 0s and/or 1s: 0 represents a coin with heads facing up; 
 * 1 represents a coin with tails facing up. For example, given array A consisting of six numbers, such that:
 * <p/>
 * A[0] = 1 
 * A[1] = 1 
 * A[2] = 0 
 * A[3] = 1 
 * A[4] = 0 
 * A[5] = 0 
 * <p/>
 * the function should return 4. The initial adjacency is 2, as there are two pairs of adjacent coins with the same side facing up, 
 * namely (0, 1) and (4, 5). After reversing the coin represented by A[2], the adjacency equals 4, as there are four pairs of adjacent coins 
 * with the same side facing up, namely: (0, 1), (1, 2), (2, 3) and (4, 5), and it is not possible to obtain a higher adjacency. The same adjacency 
 * can be obtained by reversing the coin represented by A[3].
 */
public class Coins {
	
	public static int solution(List<Integer> coins) {
		int adjacency = 0;
		List<Integer> best_solutions = new ArrayList<Integer>();
		//petla flipuje poszczegolne monety
		for(int i=0; i<coins.size(); i++) {
			coins.set(i, flip(coins.get(i))); //zamienia wartosc z 0 na 1 i odwrotnie na aktualnym elemencie tablicy
			//petla sprawdza sasiadow
			for(int j=0; j<coins.size(); j++) {
				if(j == 5) break;
				if(coins.get(j) == coins.get(j+1)) {
					adjacency++;
				}
			}
			best_solutions.add(adjacency);
			coins.set(i, flip(coins.get(i))); //odwracamy
			adjacency = 0;
		}
		
		//wybieramy najlepsze rozwiazanie sposrod dostepnych
		int result = Collections.max(best_solutions);
		return result;
	}
    
    public static int flip(int val) {
    	if(val == 0) {
    		return 1;
    	} else {
    		return 0;
    	}
    }
    
    
}