
package com.capgemini.coins;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class CoinsTest {

	@Test
	public void checkResult() {
		List<Integer> list = Arrays.asList(1,1,0,1,0,0);
		int result = Coins.solution(list);
		assertThat(result).isEqualTo(4);
	}
	
	@Test
	public void checkLeftEdge() {
		List<Integer> list = Arrays.asList(0,0,0,0,0,0);
		int result = Coins.solution(list);
		assertThat(result).isEqualTo(4);
	}
	
	@Test
	public void checkRightEdge() {
		List<Integer> list = Arrays.asList(1,1,1,1,1,1);
		int result = Coins.solution(list);
		assertThat(result).isEqualTo(4);
	}	
}
