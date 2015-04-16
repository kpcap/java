
package com.capgemini.nodes;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NodesTest {

	@Test
	public void checkIdLength() {
		List<Node> nodes = new ArrayList<Node>();
		Node node = new Node("212", "Desc2i", null);
		nodes.add(node);
		NodeValidators.validateMethod(nodes);
		assertThat(Error.contains("should have 4 characters")).isTrue();
	}
	
	@Test
	public void checkDescLength() {
		List<Node> nodes = new ArrayList<Node>();
		Node node = new Node("2122", "vbvxvdfgsdgfsfdgvbvxvdfgsdgfsfdgvbvxvdfgsdgfsfdgvbvxvdfgsdgfsfdgvbvxvdfgsdgfsfdgvbvxvdfgsdgfsfdgvbvxvdfgsdgfsfdgvbvxvdfgsdgfsfdgvbvxvd", null);
		nodes.add(node);
		NodeValidators.validateMethod(nodes);
		assertThat(Error.contains("has more than 128 characters")).isTrue();
	}	
	
	@Test
	public void checkCycles() {
		List<Node> nodes = new ArrayList<Node>();
		Node nodex = new Node("123", "sdadas", null);
		Node node1 = new Node("2122", "vbvvxvd", nodex);
		nodes.add(node1);
		nodes.add(nodex);
		NodeValidators.validateMethod(nodes);
		assertThat(Error.contains("Cycle detected")).isTrue();
	}
}