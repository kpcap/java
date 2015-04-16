
package com.capgemini.pascalrectangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
public class PascalRectangleTest {

	@Test
	public void checkResult() {
		PascalRectangle temp = new PascalRectangle();
		long result = temp.pascal(5,3);
		assertThat(result).isEqualTo(6);
	}
	
	@Test
	public void checkEdge() {
		PascalRectangle temp = new PascalRectangle();
		long result = temp.pascal(5,1);
		assertThat(result).isEqualTo(1);
	}
		
}