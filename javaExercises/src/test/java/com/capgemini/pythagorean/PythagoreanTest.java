
package com.capgemini.pythagorean;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PythagoreanTest {

	@Test
	public void checkProduct() {
		int result = Pythagorean.findProduct(1000);
		assertThat(result).isEqualTo(31875000);
	}		
		
}