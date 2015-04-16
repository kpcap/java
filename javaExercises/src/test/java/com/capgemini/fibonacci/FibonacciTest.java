
package com.capgemini.fibonacci;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class FibonacciTest {

	@Test
	public void checkResult() {
		Fibonacci fibo = new Fibonacci();
		long result = fibo.fib(5);
		assertThat(result).isEqualTo(5);
	}
	
	@Test
	public void checkLeftEdge() {
		Fibonacci fibo = new Fibonacci();
		long result = fibo.fib(1);
		assertThat(result).isEqualTo(1);
	}
	
	@Test
	public void checkRightEdge() {
		Fibonacci fibo = new Fibonacci();
		long result = fibo.fib(19);
		assertThat(result).isEqualTo(4181);
	}
	
	@Test(expected = Exception.class)
	public void checkException() {
		Fibonacci fibo = new Fibonacci();
		fibo.fib(0);
	}	
	
	/* Test wersji rekurencyjnej */
	@Test
	public void checkResultRec() {
		Fibonacci fibo = new Fibonacci();
		long result = fibo.fibRecur(5);
		assertThat(result).isEqualTo(5);
	}
	
	@Test
	public void checkLeftEdgeRec() {
		Fibonacci fibo = new Fibonacci();
		long result = fibo.fibRecur(1);
		assertThat(result).isEqualTo(1);
	}
	
	@Test
	public void checkRightEdgeRec() {
		Fibonacci fibo = new Fibonacci();
		long result = fibo.fibRecur(19);
		assertThat(result).isEqualTo(4181);
	}
	
	@Test(expected = Exception.class)
	public void checkExceptionRecur() {
		Fibonacci fibo = new Fibonacci();
		fibo.fibRecur(0);
	}		
}