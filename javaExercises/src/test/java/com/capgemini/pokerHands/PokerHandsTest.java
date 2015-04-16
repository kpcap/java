
package com.capgemini.pokerHands;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PokerHandsTest {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void shouldParseOnePair() {
		String input = "5H 5C 6S 7S KD";
		Hands hand = PokerEngine.parseHande(input);
		assertThat(hand).isEqualTo(Hands.ONE_PAIR);
	}

	@Test
	public void shouldParseTwoPairs() {
		String input = "5H 5C 6S 6H KD";
		Hands hand = PokerEngine.parseHande(input);
		assertThat(hand).isEqualTo(Hands.TWO_PAIRS);
	}

	@Test
	public void shouldParseThree() {
		String input = "5H 5C 5S 6H KD";
		Hands hand = PokerEngine.parseHande(input);
		assertThat(hand).isEqualTo(Hands.THREE);
	}

	@Test
	public void shouldParseFour() {
		String input = "5H 5C 5S 5D KD";
		Hands hand = PokerEngine.parseHande(input);
		assertThat(hand).isEqualTo(Hands.FOUR);
	}

	@Test
	public void shouldParseFull() {
		String input = "5H 5C 5S KH KD";
		Hands hand = PokerEngine.parseHande(input);
		assertThat(hand).isEqualTo(Hands.FULL);
	}

}
