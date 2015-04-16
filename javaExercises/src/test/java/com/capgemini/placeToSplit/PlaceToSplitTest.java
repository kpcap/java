
package com.capgemini.placeToSplit;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PlaceToSplitTest {

	@Test
	public void check() {
		int[] tab = {10,10};
		boolean result = PlaceToSplit.canBalance(tab);
		assertThat(result).isTrue();
	}		
	
	@Test
	public void checkIfTrue() {
		int[] tab = {1,1,1,2,1};
		boolean result = PlaceToSplit.canBalance(tab);
		assertThat(result).isTrue();
	}	
	
	@Test
	public void checkIfFalse() {
		int[] tab = {2,1,1,2,1};
		boolean result = PlaceToSplit.canBalance(tab);
		assertThat(result).isFalse();
	}
		
}