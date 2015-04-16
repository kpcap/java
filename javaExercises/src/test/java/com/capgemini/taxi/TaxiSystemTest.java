package com.capgemini.taxi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TaxiSystemTest {

	@Test
	public void testTrue() {
		int result = Dispatch.receiveCall(5);
		assertThat(result).isEqualTo(1);
	}
}
