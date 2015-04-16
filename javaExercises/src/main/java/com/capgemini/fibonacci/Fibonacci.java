package com.capgemini.fibonacci;

/**
 * Created by ldrygala on 2015-01-23.
 * F1	F2	F3	F4	F5	F6	F7	F8	F9	F10	F11	F12	F13	F14	F15	F16	F17	  F18	F19
   1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597  2584	4181
 */
public class Fibonacci {
	private long a;
	private long b;
	
	public Fibonacci() {
		a = 0;
		b = 1;
	}
	
    public long fib(int n) {
    	if (n == 0) throw new IllegalArgumentException("Bledny argument. Podano zero.");
    	for(int i=0; i<n; i++) {
    		b += a;		//Do aktualnego wyrazu dodaje poprzedni
    		a = b-a;    
    	}
        return a;
    }
   
    /* Wersja rekurencyjna */
    public long fibRecur(int n) {
    	if (n == 0) throw new IllegalArgumentException("Bledny argument. Podano zero.");
    	if (n<3) return 1;
    	return fibRecur(n-2) + fibRecur(n-1);
    }
}