package com.capgemini.placeToSplit;

/**
 * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one 
 * side is equal to the sum of the numbers on the other side.
 * Example:
 * {{{
 * canBalance({1, 1, 1, 2, 1}) → true
 * canBalance({2, 1, 1, 2, 1}) → false
 * canBalance({10, 10}) → true
 * }}}
 */
public final class PlaceToSplit {

    public static boolean canBalance(int[] nums) {
    	int sumL = 0;
    	for(int i=0; i<nums.length; i++) {
    		int sumR = 0;
    		sumL += nums[i];
    		for(int j=i+1; j<nums.length; j++) {
    			sumR += nums[j];
    		}
    		if(sumL == sumR) return true;
    	}
        return false;
    }
}
