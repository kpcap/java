package com.capgemini.nodes;

/**
 * Created by ldrygala on 2015-02-09.
 */
public class Node {
    private String id;
    private String description;
    private Node predecessor;
    
    public Node(String _id, String _description, Node _predecessor) {
    	id = _id;
    	description = _description;
    	predecessor = _predecessor;
    }
    
    public String getId() {
    	return id;
    }
    
    public String getDescription() {
    	return description;
    }
    
    public Node getPredecessor() {
    	return predecessor;
    }
    
    public String toString() {
    	return id+" "+description;
    }
}